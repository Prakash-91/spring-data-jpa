package com.prakash.springdatajpa.repos;

import com.prakash.springdatajpa.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
