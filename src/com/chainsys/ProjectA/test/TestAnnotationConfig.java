package com.chainsys.ProjectA.test;

import com.chainsys.ProjectA.appconfig.AppConfig;
import org.springframework.context.ApplicationContext; //parent
import org.springframework.context.annotation.AnnotationConfigApplicationContext; //child
import com.chainsys.ProjectA.beans.Employee;
import com.chainsys.ProjectA.beans.Customer;
public class TestAnnotationConfig {
	public static void testA() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp=ac.getBean(Employee.class);
		emp.setId(3);
		emp.setName("sheik");
		emp.print();
		Employee secondemp=ac.getBean(Employee.class);
	}
}
