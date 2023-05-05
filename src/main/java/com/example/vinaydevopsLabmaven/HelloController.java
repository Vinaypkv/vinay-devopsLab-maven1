package com.example.vinaydevopsLabmaven;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from P Vinay Kumar's Python Life DevOPS assignment Today - April 5 2023 !";
    }

}