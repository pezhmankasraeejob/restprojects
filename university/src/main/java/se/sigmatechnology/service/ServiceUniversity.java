package se.sigmatechnology.service;

import org.springframework.stereotype.Service;
import se.sigmatechnology.entities.Student;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

/**
 * Created by pke on 2017-09-20.
 */
@Service
public class ServiceUniversity {

    private final String TEST_MESSAGE = "Test is Successful!";
    private final String AUTHOR_INFO = "Programmer: Pezhman Kasraee<br>" +
            "Application Description: This is a Application to manage students and their course<br>" +
            "Technology: JDK 1.8 and RESTful architecture.";
    private ArrayList al;
    private HttpServletRequest request;

    public ServiceUniversity() {
        this.al = new ArrayList();
        al.add(new Student("1000", "Kevin", "Tatu"));
        al.add(new Student("2000", "Manfred", "Jönsson"));
        al.add(new Student("3000", "Gunnar", "Gustafsson"));
    }

    public String sendTestMessage() {
        return TEST_MESSAGE;
    }

    public String sendAuthorInfo() {
        return AUTHOR_INFO;
    }

    public Student getStudent(String id, String firstName, String surname) {
        return new Student(id, firstName, surname);
    }

    public ArrayList<Student> getAllStudents() {
        return al;
    }

    public String getClientIp(){
        String remoteAddress = "";

        if (request != null) {
            remoteAddress = request.getHeader("X-FORWARDED-FOR");
            if (remoteAddress == null || "".equals(remoteAddress)) {
                remoteAddress = request.getRemoteAddr();
            }
        }
        return remoteAddress;
    }
}
