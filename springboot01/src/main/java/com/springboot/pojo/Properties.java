package com.springboot.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Properties {

	@Value("${com.value}")
	private String STR;

	@Value("${com.bignumber}")
	private String LONG;

	public String getSTR() {
		return STR;
	}

	public void setSTR(String sTR) {
		STR = sTR;
	}

	public String getLONG() {
		return LONG;
	}

	public void setLONG(String lONG) {
		LONG = lONG;
	}

}
