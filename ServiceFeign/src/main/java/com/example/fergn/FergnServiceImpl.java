package com.example.fergn;

import org.springframework.stereotype.Component;

@Component
public class FergnServiceImpl implements  FergnService {

    @Override
    public String sayHiFromFergn(String name) {
        return "sorry," + name;
    }
}
