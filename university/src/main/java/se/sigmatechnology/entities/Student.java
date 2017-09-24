package se.sigmatechnology.entities;

import java.util.Date;

/**
 * Created by pke on 2017-09-15.
 */
public class Student {
    public String studentId;
    public String studentFirstName;
    public String studentSurname;
    public String studentCountryOfBirth;
    public Date studentBirthDate;

    public Student(){
        // TODO: 2017-09-24  
    }
    
    public Student(String studentId, String studentFirstName, String studentSurname) {
        this.studentId = studentId;
        this.studentFirstName = studentFirstName;
        this.studentSurname = studentSurname;
    }

    public Student(String studentId, String studentFirstName, String studentSurname, String studentCountryOfBirth, Date studentBirthDate) {
        this.studentId = studentId;
        this.studentFirstName = studentFirstName;
        this.studentSurname = studentSurname;
        this.studentCountryOfBirth = studentCountryOfBirth;
        this.studentBirthDate = studentBirthDate;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public String getStudentCountryOfBirth() {
        return studentCountryOfBirth;
    }

    public void setStudentCountryOfBirth(String studentCountryOfBirth) {
        this.studentCountryOfBirth = studentCountryOfBirth;
    }

    public Date getStudentBirthDate() {
        return studentBirthDate;
    }

    public void setStudentBirthDate(Date studentBirthDate) {
        this.studentBirthDate = studentBirthDate;
    }
}
