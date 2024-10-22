package com.studentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentManagementSystem.entity.Student;

@Repository

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
