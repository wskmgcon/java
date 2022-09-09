package com.cg.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cg.beans.Users;
import com.cg.services.UsersService;

@Controller
public class MainController {

	@RequestMapping("/")
	//@ResponseBody
	public String home() {
		
		return "index";
	}
	
	@RequestMapping("/contact")
	//@ResponseBody
	public String contact(Model model) {
		
		model.addAttribute("email", "daneyal@gmail.com");
		model.addAttribute("Mobile", "989876565");
		model.addAttribute("Landline", "022-423333");
		
		return "contact";
	}
	
	@RequestMapping("/getallrecords")
	public ModelAndView showRecords() {
		
		// create a list of student data, send back to view, and print the data on view
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("name", "Daneyal");
		modelAndView.addObject("email", "88888888");
		
		modelAndView.setViewName("showallrecords");
		
		return modelAndView;
	}
	
	@RequestMapping("/registration")
	public String registration() {
		
		return "registration";
	}
	
//	@RequestMapping("/userRegistration")
//	public String userRegistrationFormDataProcess(HttpServletRequest request) {
//		
//		String name = request.getParameter("name");
//		String email = request.getParameter("email");
//		String mobileNumber = request.getParameter("mobileNo");
//		
//		System.out.println(name+"  "+email+"  "+mobileNumber);
//		
//		return "";
//		
//	}
	
	// 2nd Approach
	
//	@RequestMapping("/userRegistration")
//	public String userRegistrationFormDataProcess(	@RequestParam("name") String name,
//													@RequestParam("email") String email,
//													@RequestParam("mobileNo") String mobileNumber
//													) {
//		
//		System.out.println(name+"  "+email+"  "+mobileNumber);
//		
//		return "";
//		
//	}
	
	@Autowired
	private UsersService usersService;
	// 3rd approach
	
	@RequestMapping(value = "/userRegistration", method = RequestMethod.POST)
	public String userRegistrationFormDataProcess(@ModelAttribute Users user, Model model) {
		usersService.insertNewUser(user);
		model.addAttribute("user", user);
		return "success";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
