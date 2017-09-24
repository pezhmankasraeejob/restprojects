package se.sigmatechnology.service;

import org.springframework.stereotype.Service;
import se.sigmatechnology.entities.Student;

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
    private ArrayList<Student> database;

    public ServiceUniversity() {
        this.database = new ArrayList();
        database.add(new Student("1000", "Kevin", "Tatu"));
        database.add(new Student("2000", "Manfred", "Jönsson"));
        database.add(new Student("3000", "Gunnar", "Gustafsson"));
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
        return database;
    }

    public Student findStudent(String studentId){
        Student student = new Student("000", "UNKNOWN", "UNKNOWN");

        for (Object temp : this.database)
        {
            Student tempStudent = (Student)temp;
            if(tempStudent.getStudentId().equals(studentId)){
                student.setStudentId(tempStudent.getStudentId());
                student.setStudentFirstName(tempStudent.getStudentFirstName());
                student.setStudentSurname(tempStudent.getStudentSurname());
                student.setStudentBirthDate(tempStudent.getStudentBirthDate());
                student.setStudentCountryOfBirth(tempStudent.getStudentCountryOfBirth());
            }
        }
        return student;
    }

    public void addStudent(Student student) {
        this.database.add(student);
    }

    public void updateStudent(Student student) {

        Student tempStudent = null;

        for (Object temp : this.database) {
            tempStudent = (Student) temp;
            if (tempStudent.getStudentId().equals(student.getStudentId())){
                this.database.remove(tempStudent);
                this.database.add(student);
            }
        }
    }
}
