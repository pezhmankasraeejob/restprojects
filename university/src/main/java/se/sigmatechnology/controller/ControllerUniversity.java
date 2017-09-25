package se.sigmatechnology.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.sigmatechnology.LoggerUniversity;
import se.sigmatechnology.component.ComponentUniversity;
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

    @Autowired
    private ComponentUniversity componentUniversity;

    public ControllerUniversity() {
        this.serviceUniversity = new ServiceUniversity();
    }

    @RequestMapping("/test")
    public String getTest(){
        this.loggerUniversity.sendTestInfo(componentUniversity.getClientIp());
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

    @RequestMapping("/students/{sid}")
    public Student getStudent(@PathVariable("sid") String studentId){
        return serviceUniversity.findStudent(studentId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/students")
    public void addStudent(@RequestBody Student student){
        serviceUniversity.addStudent(student);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/students")
    public void updateStudent(@RequestBody Student student){
        serviceUniversity.updateStudent(student);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/students/{id}")
    public void deleteStudent(@PathVariable("id") String id){
        serviceUniversity.deleteStudent(id);
    }
}
