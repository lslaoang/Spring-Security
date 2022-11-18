package oauth2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
public class SecurityController {

    @GetMapping(path = {"/index",""})
    public ResponseEntity<String> indexHandler(){
        return new ResponseEntity<String>("Success!", HttpStatus.ACCEPTED);
    }
}
