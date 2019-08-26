package com.example.demo53.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo53.Admin;
import com.example.demo53.Login;
import com.example.demo53.repository.LoginRepository;
import com.example.demo53.service.LoginService;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class LoginController {
	
	

	@Autowired
	LoginService loginService;

//	@GetMapping("/getRole/login")
//    public String getRole(@RequestBody Login login) {
//	
//			Login result = loginRepo.findByEmailAndPassword(login.getEmail(), login.getPassword());
//			return result.getRole();
//		
//}
    @CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/credentials")
	public List<Login> getAllCredentials() {
		System.out.println("Get all Customers...");

		
		return loginService.getAllCredentials();
	}

	
//	@PostMapping(value = "/loginCredentials/register")
//	public Login postCustomer(@RequestBody Admin admin) {
//
//		Login loginInsert = loginRepo.save(new Login(admin));
//		return loginInsert;
//	}

}