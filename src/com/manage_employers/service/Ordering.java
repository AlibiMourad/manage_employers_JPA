package com.manage_employers.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.manage_employers.entity.Employee;

public class Ordering {

	public static void main(String [] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		// Order By
		Query query = entityManager.createQuery("select e from Employee e ORDER BY e.ename ASC" );
		
		List<Employee> employees = query.getResultList();
		for(Employee e:employees) {
			 System.out.print("Employee ID :" + e.getEid( ));
	         System.out.println("\t Employee Name :" + e.getEname( ));
		}
	}
	
}
