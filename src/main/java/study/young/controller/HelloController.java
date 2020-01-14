package study.young.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	static final Logger logger = LoggerFactory.getLogger(HelloController.class.getName());

	@GetMapping("/hello")
	public String hello() {
		String s = "hello moneynote";
		System.out.println(s);

		return s;
	}

}