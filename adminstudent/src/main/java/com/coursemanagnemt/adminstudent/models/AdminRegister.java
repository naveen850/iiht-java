package com.coursemanagnemt.adminstudent.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="adminlogin")
public class AdminRegister extends Admin{

	@Column
	String adminName;

	public AdminRegister() {
		super();
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	
}
