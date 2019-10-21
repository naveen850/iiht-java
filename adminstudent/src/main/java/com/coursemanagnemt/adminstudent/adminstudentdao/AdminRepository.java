package com.coursemanagnemt.adminstudent.adminstudentdao;

import org.springframework.data.repository.CrudRepository;

import com.coursemanagnemt.adminstudent.models.Admin;

public interface AdminRepository extends CrudRepository<Admin, Integer> {

}
