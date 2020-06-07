package com.Jonathon.DisplayDate;
//import java.util.Date;
//import java.text.SimpleDateFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.time.LocalDate;
import java.time.LocalTime;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(Model model) {
		return "Index.jsp";
	}
	@RequestMapping("/date") 
		public String date(Model model) {
			LocalDate date = LocalDate.now();
			model.addAttribute("date", date);
			return "date.jsp";
		}
	@RequestMapping("/time") 
		public String time(Model model) {
			LocalTime time = LocalTime.now();
			model.addAttribute("time", time);
			return "time.jsp";
		}

}
