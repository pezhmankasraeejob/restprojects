package se.sigmatechnology.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.sigmatechnology.LoggerUniversity;
import se.sigmatechnology.entities.Student;
import se.sigmatechnology.service.ServiceUniversity;

import java.util.ArrayList;

/**
 * Created by pke on 2017-09-15.
 */
@RestController("/")
public class ControllerUniversity {

    LoggerUniversity loggerUniversity = new LoggerUniversity();

    @Autowired
    private ServiceUniversity serviceUniversity;

    public ControllerUniversity() {
        this.serviceUniversity = new ServiceUniversity();
    }

    @RequestMapping("/test")
    public String getTest(){
        this.loggerUniversity.sendTestInfo();
        return serviceUniversity.sendTestMessage();
    }

    @RequestMapping("/info")
    public String getApplicationInformation(){
        return serviceUniversity.sendAuthorInfo();
    }

    @RequestMapping("/student/{id}:{firstname}:{surname}")
    public Student getStudent(@PathVariable("id") String id, @PathVariable("firstname") String firstname, @PathVariable("surname") String surname){
        return serviceUniversity.getStudent(id, firstname, surname);
    }

    @RequestMapping("/students")
    public ArrayList<Student> getAllStudents(){
        return this.serviceUniversity.getAllStudents();
    }
}
