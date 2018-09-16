package com.manage_employers.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.manage_employers.Entity.Employee;


public class UpdateEmploye {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Employee employee  = entityManager.find(Employee.class, 1201);
		
		// before update
		System.out.println(employee);
		employee.setSalary(employee.getSalary()+500);
		entityManager.getTransaction().commit();
		
		// after update
		System.out.println(employee);
		entityManager.clear();
		entityManagerFactory.close();
		
		
	}

}
