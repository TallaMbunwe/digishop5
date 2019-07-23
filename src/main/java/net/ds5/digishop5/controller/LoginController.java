package net.ds5.digishop5.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController 
public class LoginController {

	@RequestMapping("/login")
	public String login() {
		return "login.jsp";
	}
}