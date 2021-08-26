package com.xworkz.bird.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.bird.entity.BirdEntity;




public class BirdDAOImpl implements BirdDAO{
	BirdEntity d = null;
	@Override
	public int save(BirdEntity entity) {
		Configuration configuration = new Configuration().configure().addAnnotatedClass(BirdEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
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
	public BirdEntity read(int pk) {
		Configuration configuration = new Configuration().configure().addAnnotatedClass(BirdEntity.class);
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		BirdEntity db = session.get(BirdEntity.class, pk);
		
		session.close();
		sf.close();
		
		
		return db;
	}
	

}
