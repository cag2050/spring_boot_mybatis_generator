package com.cag.controller;

import com.cag.entity.UsertestExample;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Query {

    @RequestMapping(value = "/query", method = {RequestMethod.GET, RequestMethod.POST}, produces = "application/json; charset=UTF-8")
    public String query() {
        UsertestExample example = new UsertestExample();
        System.out.println(example.toString());
        return "{\"key\": \"query\"}";
    }
}
