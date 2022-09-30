package com.learn.microservice.swaggerapi.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomePageController
{
    @GetMapping(value = "/hello",produces = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE})
    public String sayHello(Header)
    {
        return "Hello";
    }

    @GetMapping("/hello/{person_name}")
    public String sayHello(@PathVariable("person_name")String personName)
    {
        return "Hello "+personName;
    }
}
