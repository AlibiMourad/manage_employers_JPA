package com.manage_employers.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.manage_employers.entity.Employee;

public class BetweenAndLikeFunctions {

	public static void main (String [] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		//Betwee
		Query query =entityManager.createQuery("Select e from Employee e where e.salary between 0 and 20000");
		List<Employee> employees = (List<Employee>) query.getResultList();
		
		for( Employee e:employees ){
			System.out.print("Employee ID :"+e.getEid());
			System.out.println("\t Employee salary :"+e.getSalary());
		}
		
		//Like 
		Query query2 = entityManager.createQuery("select e from Employee e where e.ename like 'A%'");
		List<Employee> employees2 = query2.getResultList();
		for(Employee e:employees2){
			System.out.print("Employee ID :"+e.getEid());
			System.out.println("\t Employee salary :"+e.getEname());
		}
		
		
		
	}
}
