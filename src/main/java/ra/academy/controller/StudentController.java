package ra.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ra.academy.dto.StudentDto;
import ra.academy.model.Student;
import ra.academy.service.impl.StudentService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/student", produces = MediaType.APPLICATION_JSON_VALUE)
public class StudentController {
    @Autowired
    private StudentService studentService;
    //Lấy về toàn bộ danh sách sinh viên
    @GetMapping
    public List<StudentDto> findAll() {
        return studentService.findAll();
    }

    @DeleteMapping("/{id}")
    public Student delete(@PathVariable String id) {
        return studentService.delete(id);
    }

    @PostMapping("")
    public Student add(@RequestBody StudentDto studentDto) {
        return studentService.add(studentDto);
    }

    @PutMapping("/{id}")
    public Student edit(@PathVariable String id, @RequestBody StudentDto studentDto) {
        Student student = studentService.findById(id);
        if (student == null) {
            System.out.println("deo co");
        }
        studentDto.setStudentId(id);
        return studentService.edit(studentDto);
    }
}
