package com.te.springcore.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class Class implements Serializable {

	private String company;
	
	@Autowired(required =false)
	private Engine engine;
}
