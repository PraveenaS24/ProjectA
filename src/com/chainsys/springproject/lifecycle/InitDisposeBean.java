package com.chainsys.springproject.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
//import org.springframework.beans.factory.config.BeanPostProcessor;// refer AOP

public class InitDisposeBean implements DisposableBean, InitializingBean{
      private String city;
      private long pinCode;
      public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPinCode() {
		return pinCode;
	}

	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	// called after setters
	@Override
	public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet called");
	}
    // similar to destroy-method
	@Override
	public void destroy() throws Exception {
        System.out.println("destroy called");
	}
	public InitDisposeBean() {
		System.out.println("InitDisposeBean object is created");
	}
	// After constructor
	public void setUp() {
		System.out.println("Starting.....InitDisposeBean");
	}
	public void close() {
		System.out.println("Closing.....InitDisposeBean");
	}
   public void print() {
	   System.out.println("print called InitDisposeBean");
   }
}
