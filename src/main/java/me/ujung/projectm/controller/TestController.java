package me.ujung.projectm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author sukmin.kwon
 * @since 2017-09-10
 */
@Controller
public class TestController {

	private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

	@Value("${message.helloworld}")
	private String helloWorldMessage = "default";

	public void setHelloWorldMessage(String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}

	@RequestMapping("/text")
	@ResponseBody
	public String test() {
		LOGGER.info("I am text");
		return "I am text";
	}

	@RequestMapping("/test")
	public String test(Model model) {
		LOGGER.info("hello World");
		model.addAttribute("text", helloWorldMessage);
		return "test";
	}

}
