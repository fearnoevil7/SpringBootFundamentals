package com.Jonathon.HelloHuman;
import  org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String helloUser(@RequestParam(value="name", required=false) String nombre) {
		if (nombre == null) {
			return "Hello Human"
					+ ", Welcome to spring boot!";
		} else {
			return "Hello " + nombre
					+ ", Welcome to spring boot!";
		}
	}
}
