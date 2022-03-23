package com.example.PetShop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pet")
public class Controller {

    @GetMapping
    @ResponseBody
    public String helloWorld(){
        return "Hello World!";
    }
}
