package com.rt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {
	
	@Autowired
	employeeService es;
	
      @RequestMapping("/")
	public String Homepage() {
		return "home";

	}
  	@RequestMapping("/registerForm")
  	public String registerForm() {
  		return "register";
  	}
  	
  	@RequestMapping("/register")
	public String register(@ModelAttribute Employee e, Model m) {
		
		boolean isAdded = es.register(e);
		
		m.addAttribute("empData", e);
		
		if (isAdded) {
					
					m.addAttribute("succ" , "SuccessFully..");
		} else {
			
			m.addAttribute("err" , "Not Added..");

		}
		return "display";
	}
  	
//	***************************update*************************************************************
  	@RequestMapping("/updateForm")
  	public String update(){
  		return "update";
  		
  		
  	}
  	@RequestMapping("/update")
  	public String update(@ModelAttribute Employee e , Model m){
  		
  		boolean isAdded = es.update(e);
  		
  		m.addAttribute("empData", e);
  		
  		if (isAdded) {
  					
  			m.addAttribute("msgsucc","SuccessFully updated....");
  		} else {
  			m.addAttribute("err","Not updated....");
  		}
  		
  		return "display";
}
  //	*************************************delete******************************************
  
  	@RequestMapping("/deleteForm")
  	public String delete(){
  		return "delete";
  		
  		 
  	}
  	@RequestMapping("/delete")
  	public String delete(@RequestParam int id){
  		
  		Employee e = es.delete(id);
  		
  		return "delete";
  		
  	}
//  	***************************************select********************************************
  	
  	@RequestMapping("/GetEmployee")
	public String GetEmployee() {
		return "select";
	}

	@RequestMapping("/select")
	public String GetEmp(@RequestParam int id, Model m) {

		Employee e = es.select(id);

		m.addAttribute("empData", e);

		return "display";
	}
	
	
	
	
//	**************************************selectAll****************************************
	

	@RequestMapping("/selectAll")
	public String GetallEmp( Employee e,Model m) {

		List<Employee> list = es.selectAll();

		m.addAttribute("empData", list);

		return "displayAll";
	}
	
	
}
	
