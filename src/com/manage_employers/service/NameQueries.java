package com.manage_employers.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.manage_employers.Entity.Employee;

public class NameQueries {

	public static void main (String [] args ) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createNamedQuery("find employee by id");
		query.setParameter("id", 1204);
		List<Employee>employees = query.getResultList();
		for (Employee employee : employees) {
			 System.out.print("Employee ID :" + employee.getEid( ));
	         System.out.println("\t Employee Name :" + employee.getEname( ));
			
		}
		
	}
}
