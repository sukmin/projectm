package me.ujung.projectm;

import java.sql.Connection;

import javax.sql.DataSource;

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
public class DataSourceTest {

	@Autowired
	private DataSource dataSource;

	@Test
	public void testConnection() throws Exception {
		try (Connection connection = dataSource.getConnection()) {
			System.out.println(connection);
		} catch (Exception e) {
			throw e;
		}
	}

}
