package com.sim.control;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.sim.Player;
import com.sim.Team;

public class Main {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(com.sim.Player.class);
		configuration.addAnnotatedClass(com.sim.Team.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Team t1 = new Team("India");
		Team t2 = new Team("Mumbai Indian");
		Team t3 = new Team("CSK");
		Team t4 = new Team("RCB");
		Player p = new Player();
		p.setAge(32);
		p.setPlayerName("Rohit Sharma");
		p.getTeamList().add(t1);
		p.getTeamList().add(t2);
		session.save(t1);
		session.save(t2);
		session.save(p);
//		Player p1 = new Player ("Sachin Tendulkar",t1,43);
//		Player p2 = new Player ("MS Dhoni",t1,39);
//		Player p3 = new Player ("Virat Kohli",t1,33);
//		Player p4 = new Player ("Rohit Sharma",t1,35);
//		session.save(t1);
//		session.save(p1);
//		session.save(p2);
//		session.save(p3);
//		session.save(p4);
		transaction.commit();
		session.close();

	}
}

