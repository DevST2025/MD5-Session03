package ra.academy.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import ra.academy.dto.StudentDto;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @Column(length = 4, name = "studentId")
    private String studentId;

    @Column(length = 100, name = "studentName")
    private String studentName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(name = "birthDay")
    private Date birthDay;

    private Boolean gender;

    @Column(columnDefinition = "text")
    private String address;
    @Column(length = 45, name = "phoneNumber")
    private String phoneNumber;

    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    private List<Mark> markList;



    public Student(StudentDto studentDto) {
        this.studentId = studentDto.getStudentId();
        this.studentName = studentDto.getStudentName();
        this.birthDay = studentDto.getBirthDay();
        this.gender = studentDto.getGender();
        this.address = studentDto.getAddress();
        this.phoneNumber = studentDto.getPhoneNumber();
    }
}
