package com.hk.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hk.main.service.TabInterface;
import com.hk.main.vo.TabVO;

@Controller
public class TabController {
	@Autowired
	TabInterface tabInterface;
	
	@RequestMapping(value="/list",method={RequestMethod.GET,RequestMethod.POST})
	public String selectAll(Model model) {
		List<TabVO> list = tabInterface.select();
		
		model.addAttribute("list",list);
		
		return "listAll";
	}
}
