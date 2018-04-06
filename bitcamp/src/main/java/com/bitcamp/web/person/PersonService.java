package com.bitcamp.web.person;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.web.common.CRUDService;
import com.bitcamp.web.mapper.Mapper;

@Service
public class PersonService {
	@Autowired Mapper mapper;
	public int exist(Map<?, ?>param){     
		int count = 0;
		CRUDService.Count exist = (paramMap)-> mapper.exist(param);
		switch (param.get("type").toString()) {
		case "member":
			count = exist.execute(param);	
			break;
		default:
			break;
		}
		System.out.println("회원 아이디 존재 여부 체크 : "+ count);
		return count;
	}
}
