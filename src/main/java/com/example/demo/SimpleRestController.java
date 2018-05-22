package com.example.demo;

import org.apache.log4j.Logger;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class SimpleRestController {

	// Logger instance
	private static final Logger logger = Logger.getLogger(SimpleRestController.class);

	@GetMapping("/sts")
	public String sayHello() {
	    logger.info("into method");
	    return "hello sts";
	}

}
