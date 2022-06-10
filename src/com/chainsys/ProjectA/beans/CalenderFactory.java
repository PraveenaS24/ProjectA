package com.chainsys.ProjectA.beans;
// multiple factory methods in one class 
// Calender factory is also called as initiating bean because methods in this bean instantiates objects for other beans
public class CalenderFactory {
	// The factory method is not static here
	public Calender createCalender() {
		// The calender constructor is default access modifier so, can be called here
		// The calender class and the calender factory class are both in the same package
		return new Calender();
	}
	public Appointments createAppointment() {
		return new Appointments();
	}
}
