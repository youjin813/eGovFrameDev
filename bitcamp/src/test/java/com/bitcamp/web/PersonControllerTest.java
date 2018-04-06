package com.bitcamp.web;

import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.bitcamp.web.person.PersonService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {
			"classpath:META-INF/*-context.xml"}
	)
@WebAppConfiguration
public class PersonControllerTest {
	@Autowired PersonService s;
	@Test
	public void testHome() {
		Map<String, String>map = new HashMap<>();
		String result = "존재하지 않습니다";
		map.put("type", "member");
		map.put("id", "id");
		map.put("pass", "pass");
		map.put("data1", "lee");
		map.put("data2", "1");
		if(s.exist(map)==1){
			result="존재";
		}
		assertEquals("존재", result);
	}
}
