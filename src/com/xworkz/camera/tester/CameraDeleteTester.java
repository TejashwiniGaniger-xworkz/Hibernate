package com.xworkz.camera.tester;

import com.xworkz.camera.dao.CameraDAO;
import com.xworkz.camera.dao.CameraDAOImpl;

public class CameraDeleteTester {

	public static void main(String[] args) {
		CameraDAO dao = new CameraDAOImpl();
		dao.delete(1);

	}

}