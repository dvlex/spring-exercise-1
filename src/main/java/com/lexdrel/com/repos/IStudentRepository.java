package com.lexdrel.com.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lexdrel.com.entities.Student;

public interface IStudentRepository extends JpaRepository<Student, Long> {

}
