package com.Jonathon.MyFirstSpringBootProject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller

public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "Index.jsp";
	}
//	@RequestMapping("/world")
//		public String world() {
//			return "Class level annotations are cool too!";
//		}
}
