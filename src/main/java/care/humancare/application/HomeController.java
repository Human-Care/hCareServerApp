package care.humancare.application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
//        Map<String, String> model = new HashMap<>();
//        model.put("name", "a");
//        return new ModelAndView("index", (Map<String, ?>) null);
        System.out.println("******** index is started *************");
        return "index";
    }
}
