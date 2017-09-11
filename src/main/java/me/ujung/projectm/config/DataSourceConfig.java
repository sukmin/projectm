package me.ujung.projectm.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * http://d2.naver.com/helloworld/5102792 참고
 *
 * @author sukmin.kwon
 * @since 2017-09-11
 */

@Configuration
public class DataSourceConfig {

	@Value("${spring.datasource.driverClassName}")
	private String driverClassName;

	@Value("${spring.datasource.url}")
	private String url;

	@Value("${spring.datasource.username}")
	private String userName;

	@Value("${spring.datasource.password}")
	private String password;

	@Value("${spring.datasource.validation-query}")
	private String validationQuery;

	@Value("${spring.datasource.test-on-borrow}")
	private boolean testOnBorrow;

	@Value("${spring.datasource.max-total}")
	private int maxTotal;

	@Value("${spring.datasource.max-idle}")
	private int maxIdle;

	@Value("${spring.datasource.min-idle}")
	private int minIdle;

	@Value("${spring.datasource.max-wait-millis}")
	private long maxWaitMillis;

	@Bean(destroyMethod = "close")
	public BasicDataSource dataSource() {
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName(driverClassName);
		basicDataSource.setUrl(url);
		basicDataSource.setUsername(userName);
		basicDataSource.setPassword(password);
		basicDataSource.setValidationQuery(validationQuery);
		basicDataSource.setTestOnBorrow(testOnBorrow);
		basicDataSource.setMaxTotal(maxTotal);
		basicDataSource.setMaxIdle(maxIdle);
		basicDataSource.setMinIdle(minIdle);
		basicDataSource.setMaxWaitMillis(maxWaitMillis);
		return basicDataSource;
	}

}
