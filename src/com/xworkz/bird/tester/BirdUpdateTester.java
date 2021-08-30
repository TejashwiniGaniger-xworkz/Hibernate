package com.xworkz.bird.tester;

import com.xworkz.bird.dao.BirdDAO;
import com.xworkz.bird.dao.BirdDAOImpl;
import com.xworkz.bird.entity.BirdEntity;

public class BirdUpdateTester {

	public static void main(String[] args) {
		BirdDAO dao = new BirdDAOImpl();
		dao.updateNameById(3, "Peocock");

	}

}
