package com.newpro.studentmanagement.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
    @Id
    private Long StudentId;
//    @GeneratedValue
//    private Integer colnum;
    private Integer Standard;
    private Integer FirstLang;
    private Integer SecondLang;
    private Integer ThirdLang;
    private Integer Science;
    private Integer Mathematics;

    private Integer SST;

    @OneToMany(mappedBy = "subjectJoin")
    private List<Student> student;

}
