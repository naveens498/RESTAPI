package com.example.day8;

import java.lang.ModuleLayer.Controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;

@RestController
public class logger {

	Logger logger=LoggerFactory.getLogger(Controller.class);
	
	@GetMapping("/test")
	public String hello()
	{
		logger.trace("A TRACE Message");
		logger.debug("A DEBUG Message");
		logger.info("A INFO Message");
		logger.warn("A WARN Message");
		logger.error("A ERROR Message");
		return "HELLO SCALER!";
	}
}
