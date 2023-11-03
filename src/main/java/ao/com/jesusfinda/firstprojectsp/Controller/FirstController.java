package ao.com.jesusfinda.firstprojectsp.Controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
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

     @PostMapping("/methodWithListHeadersParams")
    public String metthodWithListHeadersParams(@RequestHeader("name") String name){
        return "metthodWithHeadersParams "+ name;
    }

    @PostMapping("/methodWithHeadersParams")
    public String metthodWithHeadersParams(@RequestHeader Map<String,String> headrs){
        return "metthodWithHeadersParams "+ headrs.entrySet();
    }



    
    /**
     * Usuario
     */
    public record Usuario(String username) {
    }
}
