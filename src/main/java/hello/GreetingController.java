package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    
    /**
     * Currently to turn on type gradlew build followed by
     * java -jar build/libs/tutorial-0.1.0.jar
     * Will have to open web page manually
     * @param name
     * @param model
     * @return
     */
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}