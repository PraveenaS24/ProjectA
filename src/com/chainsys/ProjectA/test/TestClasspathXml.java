package com.chainsys.ProjectA.test;

import org.springframework.context.ApplicationContext;//parent
import org.springframework.context.support.ClassPathXmlApplicationContext;//child
import com.chainsys.ProjectA.beans.Scoreboard;
import com.chainsys.ProjectA.beans.Actor;
import com.chainsys.ProjectA.beans.Customer;
import com.chainsys.ProjectA.beans.Employee;
import com.chainsys.ProjectA.beans.Lunch;
import com.chainsys.ProjectA.beans.Calender;

public class TestClasspathXml {
	public static void testA() {
		Employee emp = new Employee();
		emp.setId(36);
		emp.setName("joshi");
		emp.print();
	}

	public static void testB() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//		Employee emp = ac.getBean(Employee.class);
		Employee emp = (Employee) ac.getBean("emp");
		emp.setId(77);
		emp.setName("Subramani");
		emp.print();
		Customer c = ac.getBean(Customer.class);
		c.setIdname(345);
		c.setName("dhivi");
		c.print();
	}

	public static void testlazyinit() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp = ac.getBean(Employee.class);
		Customer c = ac.getBean(Customer.class);
		// lazy-init="true" for customer. An object is created now (firstcall to
		// getBean() method for Customer.class)
		Employee secondemp = ac.getBean(Employee.class);
		Customer secondcus = ac.getBean(Customer.class);
		System.out.println(emp.hashCode());
		System.out.println(secondemp.hashCode());
		System.out.println(c.hashCode());
		System.out.println(secondcus.hashCode());
	}

	public static void testPrototype() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Actor hero = ac.getBean(Actor.class);
		Actor heroin = ac.getBean(Actor.class);
		Actor comedian = ac.getBean(Actor.class);
		Actor friend = ac.getBean(Actor.class);
		System.out.println(hero.hashCode());
		System.out.println(heroin.hashCode());
		System.out.println(comedian.hashCode());
		System.out.println(friend.hashCode());
	}

	public static void testBeanWithConstructor() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
	}

	public static void testFactoryMethod() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Scoreboard sb = ac.getBean("sb1", Scoreboard.class);
		sb.targetScore = 183;
		System.out.println(sb.targetScore);
		Scoreboard sb2 = ac.getBean("sb2", Scoreboard.class);
		System.out.println(sb2.targetScore);
	}

	public static void testCalenderFactory() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Calender today = ac.getBean(Calender.class);
		today.day = 9;
		today.month = "june";
		today.year = 2022;
		System.out.println(today.day);
		System.out.println(today.month);
		System.out.println(today.year);

	}
	public static void testLunchFactory() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("Lunch.xml");
		Lunch nvsilunch=ac.getBean("nvsilunch",Lunch.class);
		Lunch vsilunch=ac.getBean("vsilunch",Lunch.class);
		Lunch nilunch=ac.getBean("nilunch",Lunch.class);
		Lunch chlunch=ac.getBean("chlunch",Lunch.class);
		System.out.println("-----");
		nvsilunch.serve();
		System.out.println("-----");
		vsilunch.serve();
		System.out.println("-----");
		nilunch.serve();
		System.out.println("-----");
		chlunch.serve();
	}
	public static void testSetterDi() {
		ApplicationContext ac1 = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp=ac1.getBean("emp1",Employee.class);
		emp.print();
	}
}
