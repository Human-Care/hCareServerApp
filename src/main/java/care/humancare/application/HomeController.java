package care.humancare.application;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
@Api(description = "Main controller")
public class HomeController {

    @GetMapping("/")
    @ApiOperation(value = "Get index page", response = String.class)
    public String index(){
//        Map<String, String> model = new HashMap<>();
//        model.put("name", "a");
//        return new ModelAndView("index", (Map<String, ?>) null);
        System.out.println("******** index is started *************");
        return "index";
    }
}
