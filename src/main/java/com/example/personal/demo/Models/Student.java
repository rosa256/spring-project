package com.example.personal.demo.Models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String surname;
    private Integer age;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_schedule")
    private Schedule schedule;


    public Student() {
    }

    public Student(String name, String surname, Integer age, Schedule schedule) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.schedule = schedule;
    }

    public int getColumnCount() {

        return getClass().getDeclaredFields().length;
    }
}
