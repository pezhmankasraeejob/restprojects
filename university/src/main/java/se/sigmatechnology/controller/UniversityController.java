package se.sigmatechnology.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.sigmatechnology.entities.Student;
import se.sigmatechnology.service.UniversityService;

/**
 * Created by pke on 2017-09-15.
 */
@RestController("/")
public class UniversityController {

    @Autowired
    private UniversityService universityService;

    public UniversityController() {
        this.universityService = new UniversityService();
    }

    @RequestMapping("/test")
    public String getTest(){
        return universityService.sendTestMessage();
    }

    @RequestMapping("/info")
    public String getApplicationInformation(){
        return universityService.sendAuthorInfo();
    }

    @RequestMapping("/student/{id}:{firstname}:{surname}")
    public Student getStudent(@PathVariable("id") String id, @PathVariable("firstname") String firstname, @PathVariable("surname") String surname){
        return universityService.getStudent(id, firstname, surname);
    }
}
