package com.manage_employers.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.manage_employers.entity.Employee;

public class CreateEmployee {

	public static void main(String [] args) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");

		EntityManager entityManager = emfactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		Employee employee = new Employee();
		employee.setEid(1201);
		employee.setEname("ALIBI");
		employee.setSalary(1100);
		employee.setDeg( "IT-Engineer");
		
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		emfactory.close();
		
		
	}
}
