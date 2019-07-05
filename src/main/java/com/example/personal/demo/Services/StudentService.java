package com.example.personal.demo.Services;

import com.example.personal.demo.Models.Student;
import com.example.personal.demo.Repositories.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private IStudentRepository studentRepository;

    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    public Student findById(Long id){
        return studentRepository.findById(id).get();
    }

    public void save(Student student){
        studentRepository.save(student);
    }
}
