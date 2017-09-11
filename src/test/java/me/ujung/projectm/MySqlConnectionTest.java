package me.ujung.projectm;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

/**
 * @author sukmin.kwon
 * @since 2017-09-11
 */
public class MySqlConnectionTest {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://적절한IP:포트번호/DB명?Unicode=true&characterEncoding=UTF-8&autoReconnect=true&useSSL=false";
	private static final String USER = "계정명";
	private static final String PASSWORD = "계정암호";

	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER);

		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
			System.out.println(connection);
		} catch (Exception e) {
			throw e;
		}
	}

}
