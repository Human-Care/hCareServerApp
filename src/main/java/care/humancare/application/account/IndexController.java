package care.humancare.application.account;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
@Api(description = "Controller which provides front-end pages")
public class IndexController {

    @ApiOperation(value = "Get index page", response = String.class)
    public String index(){
//        Map<String, String> model = new HashMap<>();
//        model.put("name", "a");
//        return new ModelAndView("index", (Map<String, ?>) null);
        return "index";
    }



}
