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
}
