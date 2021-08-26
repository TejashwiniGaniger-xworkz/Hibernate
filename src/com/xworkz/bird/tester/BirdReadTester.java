package com.xworkz.bird.tester;

import com.xworkz.bird.dao.BirdDAO;
import com.xworkz.bird.dao.BirdDAOImpl;
import com.xworkz.bird.entity.BirdEntity;


public class BirdReadTester {

	public static void main(String[] args) {
		BirdDAO dao = new BirdDAOImpl();
		BirdEntity e = dao.read(2);
		System.out.println(e);

	}

}
