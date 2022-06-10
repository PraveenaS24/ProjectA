package com.chainsys.ProjectA.beans;

public class Customer {
	public int getIdname() {
		return idname;
	}

	public void setIdname(int idname) {
		this.idname = idname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int idname;
	private String name;

	public void print() {
		System.out.println(this.getIdname());
		System.out.println(this.getName());
	}
	public Customer() {
		System.out.println("Customer object created " + hashCode());
	}
}


