package me.ujung.projectm.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import me.ujung.projectm.dao.MessageDao;
import me.ujung.projectm.model.Message;

/**
 * @author sukmin.kwon
 * @since 2017-09-10
 */
@Controller
public class TestController {

	private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

	@Value("${message.helloworld}")
	private String helloWorldMessage = "default";

	private MessageDao messageDao;

	@Autowired
	public TestController(MessageDao messageDao) {
		this.messageDao = messageDao;
	}

	public void setHelloWorldMessage(String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}

	@RequestMapping("/text")
	@ResponseBody
	public List<Message> test() {
		return messageDao.selectMessages();
	}

	@RequestMapping("/test")
	public String test(Model model) {
		LOGGER.info("hello World");
		model.addAttribute("text", helloWorldMessage);
		model.addAttribute("messages", messageDao.selectMessages());
		return "test";
	}

}
