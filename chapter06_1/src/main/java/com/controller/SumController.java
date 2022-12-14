package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bean.SumDTO;

@Controller
public class SumController {

	/*
	//@RequestMapping(value="/input.do", method=RequestMethod.GET)
	@GetMapping(value="/input.do")
	public ModelAndView input() { //사용자가 만든 콜백 메소드
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/sum/input");
		return mav;	
	}
	*/
	@GetMapping(value="/input.do")
	public String input() {
		return "/sum/input";
	}
	
	/* result 주석 1방식
	@GetMapping(value="/result.do")
	public String result() { //사용자가 만든 콜백 메소드
		return "/sum/result";		
	}
	*/
	/* result 주석 2방식
	@GetMapping(value="/result.do")
	public ModelAndView result(@RequestParam int x, 
								@RequestParam int y) { //사용자가 만든 콜백 메소드
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("x", x);
		mav.addObject("y", y);
		mav.setViewName("sum/result");
			
		return mav;		
	}
	*/
	/* result 주석 2방식 2번째
	@GetMapping(value="/result.do")
	public ModelAndView result(@RequestParam(required = false, defaultValue = "0") String x, 
								@RequestParam(required = false, defaultValue = "0") String y) { //사용자가 만든 콜백 메소드
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("x", x);
		mav.addObject("y", y);
		mav.setViewName("sum/result");
			
		return mav;		
	}
	*/
	/* result 주석 2방식 3번째
	@GetMapping(value="/result.do")
	public String result(@RequestParam Map<String, String> map, ModelMap modelMap) { //사용자가 만든 콜백 메소드
		
		modelMap.put("x", map.get("x"));
		modelMap.put("y", map.get("y"));
				
		return "sum/result";		
	}
	*/
	@GetMapping(value="/result.do")
	public String result(@ModelAttribute SumDTO sumDTO, Model model) { //사용자가 만든 콜백 메소드
		
		model.addAttribute("x", sumDTO.getX());
		model.addAttribute("y", sumDTO.getY());
				
		return "sum/result";		
	}
	

}
