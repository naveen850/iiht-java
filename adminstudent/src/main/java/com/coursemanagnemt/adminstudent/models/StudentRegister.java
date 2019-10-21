package com.coursemanagnemt.adminstudent.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")

public class StudentRegister extends Student {
	
	@Column(name = "sno")
	Integer studentNumber;
	@Column(name = "name")
	String studentName;
	@Column(name = "course")
	String studentCourse;
	@Column(name = "fee")
	Integer studentCourseFee;
	public StudentRegister() {
		super();
	}
	public Integer getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(Integer studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	public Integer getStudentCourseFee() {
		return studentCourseFee;
	}
	public void setStudentCourseFee(Integer studentCourseFee) {
		this.studentCourseFee = studentCourseFee;
	}
	@Override
	public String toString() {
		return "StudentRegister [studentNumber=" + studentNumber + ", studentName=" + studentName + ", studentCourse="
				+ studentCourse + ", studentCourseFee=" + studentCourseFee + "]";
	}
	
	

}
