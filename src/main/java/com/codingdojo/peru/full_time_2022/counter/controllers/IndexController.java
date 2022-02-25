package com.codingdojo.peru.full_time_2022.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	private int count = 0;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(HttpSession session) {
		if (session.getAttribute("count") != null) {
			count = (int) session.getAttribute("count") + 1;
			session.setAttribute("count", count);
		}
	    return "index.jsp";
	}
	
	@RequestMapping(value = "/counter", method = RequestMethod.GET)
	public String counter(Model model, HttpSession session) {
		session.setAttribute("count", count);
		model.addAttribute("counter", count);
		return "counter.jsp";
	}
	
	@RequestMapping(value = "/reboot", method = RequestMethod.POST)
	public String reboot(Model model, HttpSession session) {
		count = 0;
		session.setAttribute("count", count);
		model.addAttribute("counter", count);
		return "redirect:/counter";
	}
}
