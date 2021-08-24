package com.xworkz.soapex.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xowrkz.soapex.dto.SoapDTO;

public class SoapDAOImpl implements SoapDAO {

	@Override
	public int save(SoapDTO entity) {
		Configuration configure = new Configuration();
		configure.configure();
		configure.addAnnotatedClass(SoapDTO.class);
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
