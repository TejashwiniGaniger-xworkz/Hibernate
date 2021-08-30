package com.xworkz.bird.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.bird.entity.BirdEntity;
import com.xworkz.bird.util.SFUtil;




public class BirdDAOImpl implements BirdDAO{
	BirdEntity d = null;
	@Override
	public int save(BirdEntity entity) {
		SessionFactory factory = SFUtil.getFactory();
		Session session = factory.openSession();
    
		
		Transaction tx = session.beginTransaction();
		int pk = (int) session.save(entity);
		tx.commit();
		System.out.println(pk);
		session.close();
		
		return pk;
	}

	@Override
	public BirdEntity read(int pk) {
		SessionFactory factory = SFUtil.getFactory();
		Session session = factory.openSession();
		
		BirdEntity db = session.get(BirdEntity.class, pk);
		
		session.close();
		
		
		
		return db;
	}

	@Override
	public void updateNameById(int id, String name) {
		SessionFactory factory = SFUtil.getFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		BirdEntity dto = new BirdEntity();
		dto = (BirdEntity) session.get(BirdEntity.class, id);
		dto.setName(name);
	    session.update(dto);
		session.getTransaction().commit();
		System.out.println("updated name : " + name);
		session.close();

	}

	@Override
	public void deleteById(int id) {
		SessionFactory factory = SFUtil.getFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		BirdEntity dto = new BirdEntity();
		dto = session.get(BirdEntity.class, id);
	   session.delete(dto);
	   session.getTransaction();
	   System.out.println("deleted name : " + id);
	   session.close();
		
	}
	

}
