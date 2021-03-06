package com.cts.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.entity.Admin;
import com.cts.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@GetMapping("/adminhome")
	public String adminList(Model model,Principal p) {
		String username = p.getName();
			Admin admin= adminService.getAdmin(username);
			model.addAttribute("admin",admin);
			System.out.println(admin+"sdfsdgf72342895"); 
			return "adminHome";
		}
	
}
