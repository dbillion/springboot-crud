package com.dayo.springbootcrud.repository;

import com.dayo.springbootcrud.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student,Integer> {


}
