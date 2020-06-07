package com.Jonathon.IntroToRouting;
import  org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class DojoController {
	@RequestMapping("/")
	public String dojo(@RequestParam(value="dojo") String Dojo) {
		return "The " + Dojo + " is awesome";
	}
	@RequestMapping("/burbank/{burbank-dojo}")
	public String burbankDojo(@PathVariable("burbank-dojo") String burbankDojo) {
		return burbankDojo + " is located in Southern California!";
	}
	@RequestMapping("/sanJose/{san-jose}")
	public String sanJose(@PathVariable("san-jose") String sanJose) {
		return sanJose + " dojo is the headquarters.";
	}
}
