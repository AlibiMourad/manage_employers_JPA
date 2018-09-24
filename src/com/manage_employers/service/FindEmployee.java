 package com.manage_employers.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.manage_employers.entity.Employee;


public class FindEmployee {

	public static void main(String[] args ) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee employee = entityManager.find(Employee.class, 1201);
		
		System.out.println("employee ID = " + employee.getEid());
		System.out.println("employee NAME = " + employee.getEname());
		System.out.println("employee SALARY = " + employee.getSalary());
		System.out.println("employee DESIGNATION = " + employee.getDeg());
		
	}
}
