package com.example.personal.demo.Repositories;

import com.example.personal.demo.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
