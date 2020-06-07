package com.Jonathon.dojoSurvey;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import javax.servlet.http.HttpSession;
import java.time.LocalDate;
import java.time.LocalTime;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "Index.jsp";
	}
	@RequestMapping(path = "/postData", method = RequestMethod.POST)
	public String process(HttpSession session, @RequestParam("name") String name, @RequestParam("location") String location, @RequestParam("language") String language, @RequestParam("comment") String comment) {
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("language", language);
		session.setAttribute("comment", comment);
		return "redirect:/results";
	}
	@RequestMapping("/results")
	public String results(HttpSession session, Model model) {
		String name = (String) session.getAttribute("name");
		String location = (String) session.getAttribute("location");
		String language = (String) session.getAttribute("language");
		String comment = (String) session.getAttribute("comment");
		model.addAttribute("name", name);
		model.addAttribute("location", location);
		model.addAttribute("language", language);
		model.addAttribute("comment", comment);
		return "results.jsp";
	}
	
}
