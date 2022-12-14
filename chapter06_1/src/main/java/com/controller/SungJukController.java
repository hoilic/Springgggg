package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.SungJukDTO;

//@Controller
@RequestMapping(value = "/sungJuk")
public class SungJukController {

	@RequestMapping(value="/input.do")	
	public String input() { //사용자가 만든 콜백 메소드
		return "/sungJuk/input";	
	}
	
	/*
	  @RequestMapping(value="/sungJuk/input.do", method = RequestMethod.GET)
	 
	public String input() {
		return "/sungJuk/input"
	}
	*/
	
	@PostMapping(value="/result.do")
	public String result(@ModelAttribute SungJukDTO sungJukDTO, Model model) {
		int tot = sungJukDTO.getKor()+sungJukDTO.getEng()+sungJukDTO.getMath();
		double avg = (double)tot/3;
		
		sungJukDTO.setTot(tot);
		sungJukDTO.setAvg(avg);
		
		model.addAttribute("sungJukDTO", sungJukDTO);
		
		return "sungJuk/result";
	}
	
	/*
	@GetMapping(value="/sungJuk/result.do")
	public String result(@ModelAttribute SungJukDTO sungJukDTO, Model model) { //사용자가 만든 콜백 메소드
		
		model.addAttribute("name", sungJukDTO.getName());
		model.addAttribute("kor", sungJukDTO.getKor());
		model.addAttribute("eng", sungJukDTO.getEng());
		model.addAttribute("math", sungJukDTO.getMath());
		
		sungJukDTO.tot();
		model.addAttribute("tot", sungJukDTO.getTot());
		sungJukDTO.avg();
		model.addAttribute("avg", sungJukDTO.getAvg());
				
		return "sungJuk/result";		
	}
	*/
	
}
