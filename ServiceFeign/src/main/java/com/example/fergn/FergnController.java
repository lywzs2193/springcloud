package com.example.fergn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FergnController {

    @Autowired
    private FergnService fergnService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return fergnService.sayHiFromFergn(name);
    }
}
