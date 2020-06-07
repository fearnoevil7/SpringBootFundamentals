package com.Jonathon.TheCode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.ui.Model;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "Index.jsp";
	}
	@RequestMapping(value = "/postData", method = RequestMethod.POST )
	public String postData(HttpSession session, @RequestParam(value="code") String code) {
//		if(code == "bushido") {
//			session.setAttribute("code", code);
//			return "redirect:/code";
//		} else {
//			return "redirect:/error";
//		}
		session.setAttribute("code", code);
		return "redirect:/code";
		
	}
	@RequestMapping("/code")
	public String dashboard(HttpSession session, Model model) {
		String code = (String) session.getAttribute("code");
//		if (code == "bushido") {
//			model.addAttribute("thecode", code);
//			return "Code.jsp";
//		} else {
//			return "redirect:/error";
//		}
		model.addAttribute("thecode", code);
		return "Code.jsp";
	}
//	@RequestMapping("/error")
//	public String flashMessages(RedirectAttributes redirectAttributes) {
//		redirectAttributes.addFlashAttribute("error", "You must train harder!");
//		return "redirect:/";
//	}
}
