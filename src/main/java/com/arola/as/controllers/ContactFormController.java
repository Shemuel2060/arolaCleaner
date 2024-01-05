package com.arola.as.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.arola.as.api.Visitors;

@Controller
public class ContactFormController {
	
	@RequestMapping("/showContactForm")
	public String showContactForm() {
		return "contact-form";
	}
	
	// handler for processing form
	
	@RequestMapping("/processContactForm")
	public String processContactForm(Visitors visitor, Model model) { 
		
		//the model for transferring data from controller to view
		model.addAttribute("visitor", visitor);
		
		// access the attribute names in the view page to get the inputs and display them
		
		return "processedContact-form";
	}

}
