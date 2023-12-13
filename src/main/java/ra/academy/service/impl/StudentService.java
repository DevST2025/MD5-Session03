package ra.academy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.academy.dto.StudentDto;
import ra.academy.model.Student;
import ra.academy.repository.IStudentRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentService {
    @Autowired
    private IStudentRepository studentRepository;

    public List<StudentDto> findAll() {
        return studentRepository.findAll().stream().map(StudentDto::new).collect(Collectors.toList());
    }

    public Student findById(String id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student delete(String id) {
        Optional<Student> s = studentRepository.findById(id);
        s.ifPresent(student -> studentRepository.deleteById(student.getStudentId()));
        return s.orElse(null);
    }

    public Student add(StudentDto studentDto) {
        Student student = studentRepository.save(new Student(studentDto));
        return student;
    }

    public Student edit(StudentDto studentDto) {
        Student student = studentRepository.save(new Student(studentDto));
        return student;
    }



}
