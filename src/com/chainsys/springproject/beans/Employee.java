package com.chainsys.springproject.beans;

public class Employee {
	private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(this.getId());
        System.out.println(this.getName());
    }

    public Employee() {
        System.out.println("Employee object created "+hashCode());
    }

}




//package com.chainsys.ProjectA.beans;

//public class Employee {
//	public int getIdname() {
//		return idname;
//	}
//
//	public void setIdname(int idname) {
//		this.idname = idname;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	private int idname;
//	private String name;
//
//	public void print() {
//		System.out.println(this.getIdname());
//		System.out.println(this.getName());
//	}
//	public Employee() {
//		System.out.println("Employee object created " + hashCode());
//	}
//}
