package com.payment.web.mvc;

import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.payment.web.repository.CustomerRepository;
import com.payment.web.mvc.EntryController;

@Controller
public class EntryController {
	
	@Autowired
	private CustomerRepository repo;
	
	Logger logger = Logger.getLogger(EntryController.class.getName());
	@GetMapping
	public String homePage()
	{
		System.out.println("index home page");
		// view name
		return "index";
	}
	@GetMapping("/signin")
	public String login(@RequestParam(required = false) String error, 
			Map<String, String> maperror)
	{
		System.out.println("login page");
		maperror.put("error", error);
		// view name
		return "login";
	}
}
