package com.coursemanagnemt.adminstudent.controllers;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.coursemanagnemt.adminstudent.adminstudentdao.AdminRepository;
import com.coursemanagnemt.adminstudent.models.Admin;
import com.coursemanagnemt.adminstudent.models.AdminRegister;

@Controller
public class AdminController {
	@Autowired
	AdminRepository repository;
	@RequestMapping(value = "/course", method =RequestMethod.GET)
     public String home()
     {
		return "home";
     }
	
	
	@RequestMapping(value = "/admin",method = RequestMethod.GET)
	public String admin(Model model)
	{
		model.addAttribute("Admin",new Admin());
		return "adminlogin";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String adminLogin(@ModelAttribute("Admin") Admin admin,Model model)
	{
		
		String message="";
		Iterable<Admin> admin2=repository.findAll();
	Iterator<Admin> admin3=	admin2.iterator();
	
		String username="naveen";
		String password="naveenbkm";
		if(username.equals(admin.getUserName())&& password.equals(admin.getPassword()))
		{
			message="login sucess";
			model.addAttribute("message",message);
		return "adminhome";
		}
		else
			return "home";
	}
	@RequestMapping(value = "/adminregister",method = RequestMethod.GET)
	public String adminRegister(Model model)
	{
		model.addAttribute("AdminRegister",new AdminRegister());
		return"adminregister";
	}
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@ModelAttribute("AdminRegister")AdminRegister adminRegister ,Model model)
	{
		String message="";
		Admin admin=repository.save(adminRegister);
		if(admin!=null)
		{
			message="sucessfully registered";
			model.addAttribute("message",message);
			model.addAttribute("Admin",new Admin());
		return "adminlogin";
		}
		else
		{
			message="failed regiser";
			model.addAttribute("message",message);
			model.addAttribute("AdminRegister",new AdminRegister());
			return "adminregister";
		}
	}
	
}
