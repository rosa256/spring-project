package com.example.personal.demo.Models;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String className;

    @OneToMany(mappedBy = "schedule")
    private Set<Student> students;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Schedule_Day",
            joinColumns = { @JoinColumn(name = "fk_schedule") },
            inverseJoinColumns = { @JoinColumn(name = "fk_day") }
    )
    Set<Day> days = new HashSet<>();
}
