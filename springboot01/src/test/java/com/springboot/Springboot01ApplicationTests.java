package com.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.pojo.Properties;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot01ApplicationTests {

	@Autowired
	private Properties pro;

	@Test
	public void contextLoads() {
		System.out.println(pro.getSTR() + pro.getLONG());
	}

}
