package com;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class main {
	public static void main (String[] arg) {
		
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata=new MetadataSources(registry).getMetadataBuilder().build();
		SessionFactory factory=metadata.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
		
		studentData s1=new studentData();
		s1.setName("Praveen");
		s1.setEmail("praveenrai@123");
		s1.setPassword("praveen123");
		
		Transaction tx=session.beginTransaction();
		session.save(s1);
		tx.commit();
			
		session.close();
		factory.close();
		
		System.out.println("data inserted");
			
		}
	}