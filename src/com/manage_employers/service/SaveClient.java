package com.manage_employers.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.manage_employers.entity.NonTeachingStaff;
import com.manage_employers.entity.TeachingStaff;

public class SaveClient {

	public static void main(String [] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();;
		
		//Teaching staff entity
		TeachingStaff staff1= new TeachingStaff(1,"ALIBI","Man","computer science");
		TeachingStaff staff2= new TeachingStaff(2,"Mourad","Ing","IT");
		
		 //Non-Teaching Staff entity
	      NonTeachingStaff nonstaff1=new NonTeachingStaff(3, "Rana", "Accounts");
	      NonTeachingStaff nonstaff2=new NonTeachingStaff(4, "Maher", "Office Admin");
	      

	      //storing all entities
	      entityManager.persist(staff1);
	      entityManager.persist(staff2);
	      entityManager.persist(nonstaff1);
	      entityManager.persist(nonstaff2);
	      
	      entityManager.getTransaction().commit();
	      
	      entityManager.close();
	      entityManagerFactory.close();
		
	}
}
