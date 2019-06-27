package com.example.fergn;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "SERVICE-HI", fallback = FergnServiceImpl.class)
public interface FergnService {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHiFromFergn(@RequestParam(value = "name") String name);
}
