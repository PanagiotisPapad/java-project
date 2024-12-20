package gr.uom.java_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {
    @GetMapping(value = "/hello")

    public String hello(){
        return "Hello";
    }
}
