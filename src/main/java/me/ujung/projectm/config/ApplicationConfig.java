package me.ujung.projectm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author sukmin.kwon
 * @since 2017-09-10
 */
@Configuration
@ComponentScan(
	basePackages = "me.ujung.projectm",
	excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class),
		@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class)}
)
@PropertySource({"classpath:application.properties"})
public class ApplicationConfig {

}
