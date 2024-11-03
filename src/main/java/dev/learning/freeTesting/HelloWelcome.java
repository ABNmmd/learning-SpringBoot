package dev.learning.freeTesting;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloWelcome {
    @GetMapping
    public ResponseEntity<String> hellowWelcome() {
        return new ResponseEntity<String>("Hello! welcome....", HttpStatus.OK) ;
    }
}
