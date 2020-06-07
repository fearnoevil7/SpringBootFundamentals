package com.Jonathon.sessionCounter;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;


import java.io.*;
@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(HttpSession session) {
	Integer number = (Integer) session.getAttribute("number");
		if (number == null) {
			number = 0;
		}
		session.setAttribute("count", number);
		return "Index.jsp";
	}
	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model) {
		Integer count = (Integer) session.getAttribute("count");
		model.addAttribute("name", count);
		count++;
		session.setAttribute("number", count);
		return "counter.jsp";
	}

}
