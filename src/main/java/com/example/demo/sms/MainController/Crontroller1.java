package com.example.demo.sms.MainController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.sms.Model.Student;
import com.example.demo.sms.Repository.StudentRepository;




@Controller
public class Crontroller1 {
 
	@Autowired
	public StudentRepository sr;
	
	@RequestMapping("/home")
	public String HomePage()
	{
		return "HomePage.html";
	}
	
	@GetMapping("/findbyname")
    public String searchByName(@RequestParam("name") String name, Model model) {
		List<Student> p = sr.findBysName(name);
     	model.addAttribute("programmer",p);
      	return "User.html";
        
    }
	
	

}
