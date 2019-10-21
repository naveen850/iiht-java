package com.coursemanagnemt.adminstudent.adminstudentdao;

import org.springframework.data.repository.CrudRepository;

import com.coursemanagnemt.adminstudent.models.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>{

}
