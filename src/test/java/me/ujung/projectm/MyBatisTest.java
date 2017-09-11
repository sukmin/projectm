package me.ujung.projectm;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import me.ujung.projectm.config.ApplicationConfig;

/**
 * @author sukmin.kwon
 * @since 2017-09-11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {
	ApplicationConfig.class
})
public class MyBatisTest {

	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	@Test
	public void testFactory() {
		System.out.println(sqlSessionFactory);
	}

	@Test
	public void testSession() {
		try (SqlSession session = sqlSessionFactory.openSession()) {
			System.out.println(session);
		} catch (Exception e) {
			throw e;
		}
	}

}
