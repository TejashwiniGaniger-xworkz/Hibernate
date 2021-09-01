package com.xworkz.camera.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.camera.entity.CameraEntity;
import com.xworkz.camera.util.SFUtil;

public class CameraDAOImpl implements CameraDAO {
	private SessionFactory factory = SFUtil.getFactory();

	@Override
	public int save(CameraEntity entity) {

		try (Session session = factory.openSession()) {

			Transaction tx = session.beginTransaction();
			int pk = (int) session.save(entity);
			System.out.println(pk);
			System.out.println(entity);
			session.flush();
			session.clear();
			tx.rollback();

			return pk;
		}
	}

	@Override
	public CameraEntity readCameraEntitybyId(int pk) {

		try (Session session = factory.openSession()) {
			CameraEntity dt = session.get(CameraEntity.class, pk);
			System.out.println(dt);

			return dt;
		}
	}

	@Override
	public void updateNameById(int id, String name) {

		try (Session session = factory.openSession()) {
			Transaction tr = session.beginTransaction();
			CameraEntity dto = new CameraEntity();
			dto = (CameraEntity) session.get(CameraEntity.class, id);
			dto.setName(name);
			session.update(dto);
			session.flush();
			session.clear();

			System.out.println("updated name : " + name);

		}

	}

	@Override
	public void delete(int id) {
		try (Session session = factory.openSession()) {
			Object obj = session.load(CameraEntity.class, new Integer(id));
			CameraEntity dt = (CameraEntity) obj;
			Transaction tr = session.beginTransaction();
			session.delete(dt);
			System.out.println("data at " + id + "row as been deleted");
			session.flush();
			session.clear();

		}

	}

	@Override
	public void saveList(List<CameraEntity> entity) {

		List<CameraEntity> result = new ArrayList<CameraEntity>();
		for (CameraEntity camentities : result) {
			result.addAll(entity);
			
		}

	}

}
