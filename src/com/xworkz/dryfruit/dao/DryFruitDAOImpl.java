package com.xworkz.dryfruit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.xworkz.dryfruit.dto.DryFruitDTO;

public class DryFruitDAOImpl implements DryFruitDAO {

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

}
