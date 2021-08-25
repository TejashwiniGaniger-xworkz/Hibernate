package com.xworkz.dryfruit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.xworkz.dryfruit.dto.DryFruitDTO;

public class DryFruitDAOImpl implements DryFruitDAO {
DryFruitDTO d = null;
	@Override
	public int save(DryFruitDTO entity) {
		Configuration configure = new Configuration();
		configure.configure();
		configure.addAnnotatedClass(DryFruitDTO.class);
		SessionFactory factory = configure.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		int pk = (int) session.save(entity);
		tx.commit();
		System.out.println(pk);
		session.close();
		factory.close();
		return pk;
	}

	@Override
	public int create(DryFruitDTO entity) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(DryFruitDTO.class);
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		DryFruitDTO d = (DryFruitDTO) session.get(DryFruitDTO.class, 1);
		System.out.println(d);
		tr.commit();
		session.close();
		factory.close();

		return 1;
	}


	@Override
	public int update(DryFruitDTO entity) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(DryFruitDTO.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		d = (DryFruitDTO) session.get(DryFruitDTO.class, 2);
		d.setName("Pista");
		session.update(d);
		session.getTransaction().commit();
		System.out.println("updated name : " + d);
		session.close();
		return 1;
	}

	@Override
	public int delete(DryFruitDTO entity) {
		Configuration con = new Configuration();
		con.configure();
		con.addAnnotatedClass(DryFruitDTO.class);
		SessionFactory sessionfact = con.buildSessionFactory();
		Session session = sessionfact.openSession();
		Object obj = session.load(DryFruitDTO.class, new Integer(1));
		DryFruitDTO dt = (DryFruitDTO) obj;
		Transaction tr = session.beginTransaction();
		session.delete(dt);
		System.out.println("data is deleted");
		tr.commit();
		session.close();
		sessionfact.close();
		return 1;
	}

}
