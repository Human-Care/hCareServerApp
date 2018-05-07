package care.humancare.application.nails;

import care.humancare.domain.nails.NailsService;
import care.humancare.domain.nails.entity.Nails;
import care.humancare.exceptions.HumanCareException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/nails", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(description = "Controller which provides nails's methods")
public class NailsController {

    private final NailsService nailsService;

    public NailsController(NailsService nailsService) {
        this.nailsService = nailsService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Get nails by id", response = Nails.class)
    public Nails getAccount(@PathVariable String id) {
        Optional<Nails> optionalNails = nailsService.getNails(id);
        return optionalNails.orElseThrow(() -> new HumanCareException("do not have nails with id:" + id + " in data base"));
    }

    @GetMapping("/all_nails")
    @ApiOperation(value = "Get all nails", response = Nails[].class)
    public Iterable<Nails> getAllAccounts() {
        return nailsService.getAllNails();
    }

    @PostMapping("/save")
    @ApiOperation(value = "Post nails to data base", response = Nails.class)
    public Nails saveAccount(@RequestBody Nails nails) {
        return nailsService.saveNails(nails);
    }

    @PutMapping("/update")
    @ApiOperation(value = "Update nails", response = Nails.class)
    public Nails updateAccount(@RequestBody Nails nails) {
        return nailsService.updateNails(nails);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Delete nails")
    public void deleteAccount(@PathVariable String id) {
        nailsService.deleteNails(id);
    }
}
