package se.sigmatechnology.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pke on 2017-09-15.
 */
@RestController("/")
public class UniversityController {

    @RequestMapping("/test")
    public String getTest(){
        return "Test is Successful!";
    }

    @RequestMapping("/info")
    public String getApplicationInformation(){
        String result = "Programmer: Pezhman Kasraee\n"
                + "Application Description: This is a Application to manage students and their course\n"
                + "Technology: JDK 1.8 and RESTful architecture.";
        return result;
    }
}
