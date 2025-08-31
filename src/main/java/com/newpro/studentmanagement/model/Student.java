package com.newpro.studentmanagement.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    private Long StudentID;
    private String StudentName;
    private Integer Standard;
    private Character Section;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subjectJoin;
}