package com.arola.as.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactFormController {
	
	@RequestMapping("/showContactForm")
	public String showContactForm() {
		return "contact-form";
	}
	
	// handler for processing form
	
	@RequestMapping("/processContactForm")
	public String processContactForm(@RequestParam String name, @RequestParam String email,
			@RequestParam String message, Model model) { /*args names the same as used in the form input tags */
		//the model for transferring data from controller to view
		model.addAttribute("visitorName", name);
		model.addAttribute("visitorEmail", email);
		model.addAttribute("visitorMessage", message);
		// access the attribute names in the view page to get the inputs and display them
		
		return "processedContact-form";
	}

}
