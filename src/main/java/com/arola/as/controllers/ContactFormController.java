package com.arola.as.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactFormController {
	
	@RequestMapping("/showContactForm")
	public String showContactForm() {
		return "contact-form";
	}

}
