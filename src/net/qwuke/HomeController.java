package net.qwuke;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * author: Tristan Mortimer
 *
 */

@Controller
public class HomeController {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld(Model modelObj) {
		modelObj.addAttribute("test1", "megadog");
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>This message is coming from HomeController.java</h3>";
		return new ModelAndView("welcome", "message", message);
		//"welcome" points to the welcome.jsp
		//"message" is the name of the variable that the welcome.jsp will take
		//message is the internal variable(a string in this case) for this method that will be passed as the value of "message"
	}
}