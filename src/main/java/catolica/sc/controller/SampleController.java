package catolica.sc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class SampleController {

    @GetMapping("/endpoint")
    public ResponseEntity<String> get(){
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @GetMapping("/teste")
    public ResponseEntity<String> getTeste(){
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
