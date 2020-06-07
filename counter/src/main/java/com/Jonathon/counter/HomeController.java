package com.Jonathon.counter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.*;
import javax.servlet.http.HttpSession;
import javax.servlet.*;
import java.io.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		int number = 7;
//		number++;
		
		session.setAttribute("count", number);
		return "Index.jsp";
	}
	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		Integer number = (Integer) session.getAttribute("number");
		return "Counter.jsp";
	}
}
