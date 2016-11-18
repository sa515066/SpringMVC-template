package me.anchora.es.controller;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import me.anchora.es.entity.SpringmvcTest;
import me.anchora.es.service.SpringmvcTestService;

@Controller
@RequestMapping("/test")
public class SpringmvcTestController {
	private static final Logger LOGGER = Logger.getLogger(SpringmvcTestController.class);
	
	@Autowired
	private SpringmvcTestService springmvcTestService;
	
	@RequestMapping("/findAll")
	public @ResponseBody List<SpringmvcTest> findAll(){
		LOGGER.info("查询用户全部用户");
		List<SpringmvcTest> userInfos = springmvcTestService.findAll();
		return userInfos;
	}
	
	@RequestMapping("/find/{name}")
	public @ResponseBody SpringmvcTest find(@PathVariable String name){
		LOGGER.info("查询用户：" + name);
		SpringmvcTest test = springmvcTestService.getByName(name);
		return test;
	}
}
