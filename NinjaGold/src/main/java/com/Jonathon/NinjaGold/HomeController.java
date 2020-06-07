package com.Jonathon.NinjaGold;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import javax.servlet.http.HttpSession;
import java.util.Random;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collections;

@Controller
public class HomeController {
	ArrayList<Object> comments = new ArrayList<Object>();
	int totalGold;
	Random rando = new Random();
	@RequestMapping("/")
	public String index() {
		return "redirect:/gold";
	}
	@RequestMapping("/gold") 
	public String dashboard(HttpSession session, Model model) {
		Integer gold = (Integer) session.getAttribute("gold");
		if (gold == null ) {
			int totalGold = 0;
			return "Gold.jsp";
		} else {
			String location = (String) session.getAttribute("location");
//			if (location == "farm") {
//				totalGold += rando.nextInt(10);
//				LocalDate date = LocalDate.now();
//				LocalTime time = LocalTime.now();
//				Object comment = "You entered " + location + " and earned " + gold + " gold!   " + date + " " + time;
//				comments.add(comment);
//				model.addAttribute("gold", totalGold);
//				model.addAttribute("comments", comments);
//				model.addAttribute("location", location);
//				return "Gold.jsp";
//			} else if(location == "cave") {
//				totalGold += rando.nextInt(5);
//				LocalDate date = LocalDate.now();
//				LocalTime time = LocalTime.now();
//				Object comment = "You entered " + location + " and earned " + gold + " gold!   " + date + " " + time;
//				comments.add(comment);
//				model.addAttribute("gold", totalGold);
//				model.addAttribute("comments", comments);
//				model.addAttribute("location", location);
//				return "Gold.jsp";
//			} else if(location == "house") {
//				totalGold += rando.nextInt(5);
//				LocalDate date = LocalDate.now();
//				LocalTime time = LocalTime.now();
//				Object comment = "You entered " + location + " and earned " + gold + " gold!   " + date + " " + time;
//				comments.add(comment);
//				model.addAttribute("gold", totalGold);
//				model.addAttribute("comments", comments);
//				model.addAttribute("location", location);
//				return "Gold.jsp";
//			} else if(location == "casino") {
//				totalGold += rando.nextInt(50);
//				LocalDate date = LocalDate.now();
//				LocalTime time = LocalTime.now();
//				Object comment = "You entered " + location + " and earned " + gold + " gold!   " + date + " " + time;
//				comments.add(comment);
//				model.addAttribute("gold", totalGold);
//				model.addAttribute("comments", comments);
//				model.addAttribute("location", location);
//				return "Gold.jsp";
//			} else {
//				return "Gold.jsp";
//			}
			
			
			totalGold += gold;
			LocalDate date = LocalDate.now();
			LocalTime time = LocalTime.now();
			Object comment = "You entered " + location + " and earned " + gold + " gold!   " + date + " " + time;
			comments.add(comment);
			model.addAttribute("gold", totalGold);
			model.addAttribute("comments", comments);
			model.addAttribute("location", location);
			return "Gold.jsp";
		}
	}
//	@RequestMapping(path = "/process", method = RequestMethod.POST)
//	public String process(HttpSession session, @RequestParam("building") String location) {
//		Random rando = new Random();
//		String string1 = location;
//		if (string1 == "farm") {
//			int gold = rando.nextInt(10);
//			session.setAttribute("gold", gold);
//			session.setAttribute("location", location);
//			return "redirect:/";
//		}
//		if (string1 == "cave") {
//			int gold = rando.nextInt(5);
//			session.setAttribute("gold", gold);
//			session.setAttribute("location", location);
//			return "redirect:/gold";
//		}
//		if (string1 == "house") {
//			int gold = rando.nextInt(5);
//			session.setAttribute("gold", gold);
//			session.setAttribute("location", location);
//			return "redirect:/gold";
//		}
//		if (string1 == "casino") {
//			int gold = rando.nextInt(50);
//			session.setAttribute("gold", gold);
//			session.setAttribute("location", location);
//			return "redirect:/gold";
//		}
//		int gold = 0;
//		session.setAttribute("gold", gold);
//		session.setAttribute("location", location);
//		return "redirect:/gold";
//	}
	@RequestMapping("/farm")
	public String farm(HttpSession session) {
		Random rando = new Random();
		int gold = rando.nextInt(10);
		String location = "farm";
		session.setAttribute("gold", gold);
		session.setAttribute("location", location);
		return "redirect:/";
		
	}
	@RequestMapping("/cave")
	public String cave(HttpSession session) {
		Random rando = new Random();
		int gold = rando.nextInt(5);
		String location = "cave";
		session.setAttribute("gold", gold);
		session.setAttribute("location", location);
		return "redirect:/gold";
	}
	@RequestMapping("/house")
	public String house(HttpSession session) {
		Random rando = new Random();
		int gold = rando.nextInt(5);
		String location = "house";
		session.setAttribute("gold", gold);
		session.setAttribute("location", location);
		return "redirect:/gold";
	}
	@RequestMapping("/casino")
	public String casino(HttpSession session) {
		Random rando = new Random();
		int gold = rando.nextInt(50);
		String location = "casino";
		session.setAttribute("gold", gold);
		session.setAttribute("location", location);
		return "redirect:/gold";
	}
}
