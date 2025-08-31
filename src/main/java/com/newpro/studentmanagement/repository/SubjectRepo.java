package com.newpro.studentmanagement.repository;

import com.newpro.studentmanagement.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepo extends JpaRepository<Subject, Integer> {
}
