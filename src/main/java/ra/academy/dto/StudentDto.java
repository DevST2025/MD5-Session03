package ra.academy.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import ra.academy.model.Student;

import java.util.Date;

public class StudentDto {
    private String studentId;

    private String studentName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date birthDay;

    private Boolean gender;

    private String address;
    private String phoneNumber;

    public StudentDto() {
    }

    public StudentDto(Student student) {
        this.studentId = student.getStudentId();
        this.studentName = student.getStudentName();
        this.birthDay = student.getBirthDay();
        this.gender = student.getGender();
        this.address = student.getAddress();
        this.phoneNumber = student.getPhoneNumber();
    }

    public StudentDto(String studentId, String studentName, Date birthDay, Boolean gender, String address, String phoneNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.birthDay = birthDay;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
