package me.anchora.es.service;

import java.util.Date;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import me.anchora.es.entity.SpringmvcTest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-hibernate.xml" })
public class TestSpringmvcTestService {

	private static final Logger LOGGER = Logger.getLogger(TestSpringmvcTestService.class);

	@Autowired
	private SpringmvcTestService springmvcTestService;

	@Test
	public void save() {
		SpringmvcTest test = new SpringmvcTest();
		test.setId(5);
		test.setName("aaaa");
		test.setPassword("bbbbbb");
		String id = springmvcTestService.save(test);
		LOGGER.info(JSON.toJSONString(id));
	}

}