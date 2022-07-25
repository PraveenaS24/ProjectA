package com.chainsys.springproject.startup;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chainsys.springproject.view.EmployeeSprings;

public class Main {

    public static void main(String[] args) {
//        TestClassPathXml.testAutoWiredQualifier();
//        TestCar.firsttest();
//        TestAnnotationConfig.testPhone();
//        EmployeeSprings emps=new EmployeeSprings();
//        emps.DeleteEmployee();
        employeeMenu();
    }
    public static void employeeMenu() {
        ConfigurableApplicationContext apcontext=new ClassPathXmlApplicationContext("Employee.xml");
        EmployeeSprings empspring = apcontext.getBean(EmployeeSprings.class);
        Scanner sc=new Scanner(System.in);
       // empspring.setSc();
        System.out.println("1.) To add New employee in to table");
        System.out.println("2.) To Get all employee datails from table");
        System.out.println("3.) To Update employee details");
        System.out.println("4.) To Delete Employee details");
        int vCase=sc.nextInt();
        switch(vCase) {
        case 1:
            empspring.addNewEmployee();
            break;
        case 2:
            empspring.GetEmplyeeById();
            break;
        case 3:
            empspring.UpdateEmployee();
            break;
        case 4:
            empspring.DeleteEmployee();
            break;
        default:
            System.out.println("enter valid number");
        }
        apcontext.close();
        sc.close();
    }
    
}