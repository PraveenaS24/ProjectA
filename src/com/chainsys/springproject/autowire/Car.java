package com.chainsys.springproject.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import org.springframework.beans.factory.annotation.Required;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
//import javax.annotation.Resource; // @Resource not working in java9 and advance

public class Car {
	@Autowired
	private Engine petrolEngine;
	@Autowired(required = false)
	private Wheel alloy;

	public Car() {
		System.out.println("Car Object created " + hashCode());
	}

	@PostConstruct
	public void begin() {
		System.out.println("Started AnnotationLc");
	}

	@PreDestroy
	public void stop() {
		System.out.println("Stoped AnnotationLc");
	}

	public void start() {
		petrolEngine.start();
	}

	public void move() {
		alloy.rotate();
	}

}

@Component("SuvCar")
class SportsCar extends Car {
	public SportsCar() {
		System.out.println("SportsCar is started" + hashCode());
	}
}

class SuvCar extends Car {
	public SuvCar() {
		System.out.println("Suv is started" + hashCode());
	}
}
