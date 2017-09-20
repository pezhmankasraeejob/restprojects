package se.sigmatechnology.service;

import org.springframework.stereotype.Service;
import se.sigmatechnology.entities.Student;

/**
 * Created by pke on 2017-09-20.
 */
@Service
public class UniversityService {

    private final String TEST_MESSAGE = "Test is Successful!";
    private final String AUTHOR_INFO = "Programmer: Pezhman Kasraee<br>" +
            "Application Description: This is a Application to manage students and their course<br>" +
            "Technology: JDK 1.8 and RESTful architecture.";

    public String sendTestMessage(){
        return TEST_MESSAGE;
    }

    public String sendAuthorInfo(){
        return AUTHOR_INFO;
    }

    public Student getStudent(String id, String firstName, String surname){
        return new Student(id, firstName, surname);
    }
}
