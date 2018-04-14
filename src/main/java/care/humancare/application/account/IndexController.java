package care.humancare.application.account;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
//        Map<String, String> model = new HashMap<>();
//        model.put("name", "a");
//        return new ModelAndView("index", (Map<String, ?>) null);
        return "index";
    }

}
