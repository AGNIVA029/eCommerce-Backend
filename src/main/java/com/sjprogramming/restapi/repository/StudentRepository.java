package com.sjprogramming.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sjprogramming.restapi.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
