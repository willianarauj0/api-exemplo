package application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;




@RestController
public class IndexController {

    @GetMapping("/")
    public String home() {
        return "home - GET";
    }

    @PostMapping("/")
    public String homePost() {
        return "home - POST";
    }
    
}
