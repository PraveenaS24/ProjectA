package com.chainsys.ProjectA.appconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import com.chainsys.ProjectA.beans.Employee;
import com.chainsys.ProjectA.beans.Customer;

@Configuration
public class AppConfig {
	@Bean
	@Scope(value = "prototype")
	public Employee employee() {
		return new Employee();
	}

	@Bean
	public Customer customer() {
		return new Customer();
	}

}
