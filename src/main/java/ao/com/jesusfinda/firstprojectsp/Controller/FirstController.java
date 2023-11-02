package ao.com.jesusfinda.firstprojectsp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstController")
public class FirstController {
    @GetMapping("/firstMethods")

    public String firstMethod(){
        return "Meu primeiro método api rest";
    }

    
}
