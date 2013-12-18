package com.hchen.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hchen.model.GoodsInfo;
import com.hchen.persistent.dao.TestDAO;

@Controller
public class TestController {
	
	@Autowired
	private TestDAO testDAO;
	
	@RequestMapping(value="/index.do")
	public String index(HttpServletRequest request, ModelMap modelMap){
		
		List<GoodsInfo> ls = testDAO.getGoodsInfo();
		modelMap.put("goodsList", ls);
		return "index";
	}
}
