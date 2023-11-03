package ao.com.jesusfinda.firstprojectsp.Controller;

import java.util.Map;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public String methodWithListHeadersParams(@RequestHeader Map<String,String> headers){
        return "methodWithHeadersParams "+ headers.entrySet();
    }


    @PostMapping("/methodWitHeadersParams")
    public String methodWithHeadersParams(@RequestHeader("name") String name){
        return "methodWithHeadersParams "+ name;
    }

    @PostMapping("/methodResponseEntity/{id}")
    public ResponseEntity<Object> MethodResponseEntity(@PathVariable Long id){
        var usuario=new Usuario("JesusFinda");
        if(id>5){
            return ResponseEntity.status(HttpStatus.OK).body(usuario);

        }

        return ResponseEntity.badRequest().body("Número menor que 5");


    }


    
    /**
     * Usuario
     */
    public record Usuario(String username) {
    }
}
