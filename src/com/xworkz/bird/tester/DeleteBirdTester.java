package com.xworkz.bird.tester;

import com.xworkz.bird.dao.BirdDAO;
import com.xworkz.bird.dao.BirdDAOImpl;

public class DeleteBirdTester {

	public static void main(String[] args) {
		BirdDAO dao = new BirdDAOImpl();
		dao.deleteById(2);
	}

}
