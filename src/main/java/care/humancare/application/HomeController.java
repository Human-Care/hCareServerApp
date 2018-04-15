package care.humancare.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
//        Map<String, String> model = new HashMap<>();
//        model.put("name", "a");
//        return new ModelAndView("index", (Map<String, ?>) null);
        return "index";
    }
}
