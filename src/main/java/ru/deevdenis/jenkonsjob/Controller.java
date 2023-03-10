package ru.deevdenis.jenkonsjob;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    public ResponseEntity<String> greeting() {
        return ResponseEntity.ok("Hello world!");
    }

    @RequestMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Hello from test!");
    }

    @RequestMapping("/checkstyle")
    public ResponseEntity<String> checkstylePlugin() {
        return ResponseEntity.ok("Hello from checkstylePlugin!");
    }
}
