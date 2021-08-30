package com.xworkz.bird.tester;

import com.xworkz.bird.dao.BirdDAO;
import com.xworkz.bird.dao.BirdDAOImpl;
import com.xworkz.bird.entity.BirdEntity;

public class BirdSaveTester {

	public static void main(String[] args) {
	BirdEntity entity1 = new BirdEntity(3,"parrot","nest","eclectus","eclectus","fruits","female",true,"green","25cm");
	BirdDAO dao = new BirdDAOImpl();
	dao.save(entity1);
    
	

	}

}
