package com.simplilearn;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class Main {
	public static void main(String[] args) {
	StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
	  SessionFactory factory = metadata.getSessionFactoryBuilder().build();
	  Session session =factory.openSession();
	  Customer c1 = new Customer();
	  c1.setName("Praveen");
	  c1.setEmail("praveenrai@mail.com");
	  c1.setPhone(124467);
	  c1.setCity("mum");
	  c1.setBal(25346);
	  Transaction tx = session.beginTransaction();
	  session.save(c1);
	  tx.commit();
	  session.close();
	  factory.close();	
	  System.out.println("Data Inserted Successfully");
	  
	}
	}