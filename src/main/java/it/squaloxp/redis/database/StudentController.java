package it.squaloxp.redis.database;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// https://www.baeldung.com/spring-data-redis-tutorial

@Controller
@RequestMapping(path = "/student")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping(path = "/save")
    public @ResponseBody Student save() {
        Student student = new Student("Eng2015001", "John Doe", Student.Gender.MALE, 1);
        return studentRepository.save(student);
    }

    @GetMapping(path = "/get")
    public @ResponseBody Student get() {
        return studentRepository.findById("Eng2015001").get();
    }

    @GetMapping(path = "/all")
    public @ResponseBody List<Student> all() {
        Student engStudent = new Student("Eng2015001", "John Doe", Student.Gender.MALE, 1);
        Student medStudent = new Student("Med2015001", "Gareth Houston", Student.Gender.MALE, 2);
        studentRepository.save(engStudent);
        studentRepository.save(medStudent);

        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }
}
