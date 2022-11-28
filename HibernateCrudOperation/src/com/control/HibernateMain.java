package com.control;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.sim.Player;

public class HibernateMain {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(com.sim.Player.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
//		Player p1 = new Player(05, "Rohan", "India", 27);
//		Player p2 = new Player(02, "Pranav", "India", 28);
//		Player p3 = new Player(03, "Virat", "India", 33);
//		Player p4 = new Player(04, "David", "Australia", 34);
//		session.save(p1);
//		session.save(p2);
//		session.save(p3);
//		session.save(p4);	
//		Player p =session.get(Player.class, 1);
//		System.out.println("The details: " + p);
//		session.delete(p);
//		Query query = session.createQuery("from Player");
//		Query query = session.createQuery("from Player where playerName=:name");
//		Query query=session.createQuery("from Player where teamName=:name");
//		Query query =session.createQuery("from Player where age=:age order by playerName");
		Query query = session.createQuery("from Player where age between :age1 and :age2 order by playerName desc");
		query.setInteger("age1", 27);
		query.setInteger("age2", 35);
//		query.setInteger("age", 27);
//		query.setString("name", "India");
//		query.setString("name","Virat");
		List<Player> playerList=query.list();
		System.out.println("Player Details");
		for(Player p:playerList) {
			System.out.println(p);
		}
		transaction.commit();
		session.close();
	}

}
