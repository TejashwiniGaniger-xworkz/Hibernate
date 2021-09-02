package com.xworkz.camera.tester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.camera.dao.CameraDAO;
import com.xworkz.camera.dao.CameraDAOImpl;

public class DeleteListTester {

	public static void main(String[] args) {
		CameraDAO dao = new CameraDAOImpl();
		List<Integer> pkid = new ArrayList<Integer>();
		pkid.add(4);
		pkid.add(5);
		dao.deleteList(pkid);
	}

}
