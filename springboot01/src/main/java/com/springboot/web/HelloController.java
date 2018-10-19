package com.springboot.web;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${tomcatserver.url}")
	private String URL;

	@Value("${com.value}")
	private String STR;

	@Value("${com.bignumber}")
	private String LONG;

	@Value("${com.test1}")
	private String qujian;

	@RequestMapping("/b")
	public String index() {
		return URL + " STR:" + STR + "qujian:" + qujian;
	}

	@RequestMapping("/date")
	public Date now() {
		return new Date();
	}
}
