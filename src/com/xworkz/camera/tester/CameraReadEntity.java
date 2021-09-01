package com.xworkz.camera.tester;

import com.xworkz.camera.dao.CameraDAO;
import com.xworkz.camera.dao.CameraDAOImpl;
import com.xworkz.camera.entity.CameraEntity;

public class CameraReadEntity {

	public static void main(String[] args) {
		CameraEntity dto = new CameraEntity("CANON-EOS", "CANON", "CAN-8", "BLACK", 29000, "Prime", "TRYPOD-MOUNT",
				"Full=Frame", "18mPXs");

		CameraDAO dao = new CameraDAOImpl();

		dao.readCameraEntitybyId(1);
		System.out.println(dto);

	}

}