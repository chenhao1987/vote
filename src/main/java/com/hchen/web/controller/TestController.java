package com.hchen.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping(value="/index.do")
	public String index(HttpServletRequest request, ModelMap modelMap){
		String str = request.getParameter("w");
		modelMap.put("w", str);
		return "index";
	}
}
