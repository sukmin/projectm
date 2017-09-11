package me.ujung.projectm.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import me.ujung.projectm.config.ApplicationConfig;
import me.ujung.projectm.model.Message;

/**
 * @author sukmin.kwon
 * @since 2017-09-11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {
	ApplicationConfig.class
})
public class MessageDaoImplTest {

	@Autowired
	private MessageDao messageDao;

	@Test
	public void testSelectMessages() throws Exception {

		//when
		List<Message> messages = messageDao.selectMessages();

		//then
		Assert.assertTrue(messages.size() >= 1);

	}

}
