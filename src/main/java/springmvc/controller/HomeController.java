package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(Model model) {
		System.out.print("This is home url");
		model.addAttribute("name", "Utkarsh Srivastava");
		List<String> friends = new ArrayList<String>();
		friends.add("Aman");
		friends.add("Aditi");
		friends.add("Shobhit");
		model.addAttribute("f", friends);
		return "index";
	}
	
	@RequestMapping("/about")
	public String about( ) {
		System.out.println("This is about page");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help page");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Aman");
		modelAndView.addObject("roll", 21);
		
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		modelAndView.setViewName("help");
		
		//marks
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(15);
		modelAndView.addObject("marks", list);
		return modelAndView;
	}
}
