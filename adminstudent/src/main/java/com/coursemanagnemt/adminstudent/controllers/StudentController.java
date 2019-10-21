package com.coursemanagnemt.adminstudent.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coursemanagnemt.adminstudent.adminstudentdao.StudentRepository;
import com.coursemanagnemt.adminstudent.models.Admin;
import com.coursemanagnemt.adminstudent.models.Student;
import com.coursemanagnemt.adminstudent.models.StudentRegister;

@Controller
//@RequestMapping("/student")
public class StudentController {
	@Autowired
	 StudentRepository studentRepository;
	@RequestMapping(value = "/student",method = RequestMethod.GET)
	public String login(Model model)
	{
		model.addAttribute("Student",new Student());
		return "studentlogin";
	}
	@RequestMapping(value = "/register",method = RequestMethod.GET)
	public String register(Model model)
	{
		model.addAttribute("StudentRegister",new StudentRegister());
		return "studentregister";
	}
	
	@RequestMapping(value = "/studentregister",method = RequestMethod.POST)
	
	public String StudentRegister(@ModelAttribute("StudentRegister")StudentRegister studentregister,Model model)
	{
		String message=""; 
		StudentRegister register=studentRepository.save(studentregister);
		if(register!=null)
		{
			message="sucessfully register";
			model.addAttribute("message",message);
			model.addAttribute("Student",new Student());
		return "studentlogin";
		}
		else
		{
			message="registration fail";
			model.addAttribute("message",message);
			model.addAttribute("StudentRegister",new StudentRegister());
			return "studentregister";
		}
	}

}
