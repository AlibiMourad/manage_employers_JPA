package com.manage_employers.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.manage_employers.Entity.Employee;


public class DeleteEmployee {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		Employee employee = entityManager.find(Employee.class, 1201);
		entityManager.remove(employee);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();

	}

}
