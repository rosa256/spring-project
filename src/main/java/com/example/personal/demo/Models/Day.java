package com.example.personal.demo.Models;

import lombok.NonNull;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Day {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String name;

    private LocalTime startTime;

    private LocalTime endTime;

    @ManyToMany(mappedBy = "days")
    private Set<Schedule> schedules = new HashSet<>();

}
