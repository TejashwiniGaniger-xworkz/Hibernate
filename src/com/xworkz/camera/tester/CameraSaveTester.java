package com.xworkz.camera.tester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.camera.dao.CameraDAO;
import com.xworkz.camera.dao.CameraDAOImpl;
import com.xworkz.camera.entity.CameraEntity;


public class CameraSaveTester {

	public static void main(String[] args) {
		CameraEntity entity = new CameraEntity("CANON-EOS" ,"CANON", "CAN-8", "BLACK", 29000, "Prime", "TRYPOD-MOUNT",
				"Full=Frame", "18mPXs");

		CameraDAO dao = new CameraDAOImpl();
		dao.save(entity);
		System.out.println("***********************************");
		List<CameraEntity> cam = new ArrayList<CameraEntity>();
		System.out.println("Save List");
		cam.add(entity);
		
	}

}