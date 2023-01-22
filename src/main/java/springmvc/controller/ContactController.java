package springmvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc.model.User;

@Controller
public class ContactController {
	
	@Autowired
	private springmvc.service.UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Sample form filling");
		m.addAttribute("Desc", "Form filling with Spring MVC");
	}

	@RequestMapping("/contact")
	public String showForm(Model m) {
		
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {

		System.out.println(user);
		this.userService.createUser(user);

		return "success";

	}

	/*
	 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
	 * String handleForm(@RequestParam("email") String
	 * userEmail, @RequestParam("userName") String userName,
	 * 
	 * @RequestParam("password") String userPassword, Model model) {
	 * 
	 * User user = new User(); user.setEmail(userEmail); user.setUserName(userName);
	 * user.setPassword(userPassword);
	 * 
	 * 
	 * System.out.println("Email " + userEmail); System.out.println("userName " +
	 * userName); System.out.println("Password " + userPassword);
	 * 
	 * 
	 * System.out.println(user); // process
	 * 
	 * model.addAttribute("name", userName); model.addAttribute("password",
	 * userPassword); model.addAttribute("email", userEmail);
	 * 
	 * model.addAttribute("user", user); return "success";
	 * 
	 * }
	 */
}
