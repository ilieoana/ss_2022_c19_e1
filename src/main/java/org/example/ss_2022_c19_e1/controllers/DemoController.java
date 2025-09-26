package org.example.ss_2022_c19_e1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo")
//    @CrossOrigin("http://localhost:8080")
//    @CrossOrigin("*") //never use in prod env
    public String demo() {
        return "Demo";
    }
}