package main.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@Controller
public class MainController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)	
	public String index() { //사용자가 만든 콜백 메소드
		return "index";	
	}
}
