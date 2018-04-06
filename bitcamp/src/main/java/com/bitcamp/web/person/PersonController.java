package com.bitcamp.web.person;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//

@Controller
public class PersonController {
private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
	@Autowired PersonService s;
	@RequestMapping("/")
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		Map<String, String>map = new HashMap<>();
		String result = "false";
		map.put("type", "member");
		map.put("id", "id");
		map.put("pass", "pass");
		map.put("data1", "lee");
		map.put("data2", "1");
		if(s.exist(map)==1){
			result="true";
		}
		System.out.println("존재여부는 "+result);
		model.addAttribute("exist", result);
		
		return "app";
	}
	@RequestMapping("/exist")
	public String exist(){
		System.out.println("exist");
		return "component/exist";
		
	}
	@RequestMapping("/not-exist")
	public String notExist(){
		System.out.println("not exist");
		return "component/not-exist";
	}
}
