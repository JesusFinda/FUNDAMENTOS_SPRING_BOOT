package ao.com.jesusfinda.firstprojectsp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstController")
public class FirstController {

    @GetMapping("/firstMethods/{id}")
    public String firstMethod(@PathVariable String id){
        return "O parametro é: "+id;
    }

    @PostMapping("/methodWithBodyParams")
    public String metthodWithBodyParams(@RequestBody Usuario usuario){
        return "metthodWithBodyParams "+ usuario.username;
    }
    
    /**
     * Usuario
     */
    public record Usuario(String username) {
    }
}
