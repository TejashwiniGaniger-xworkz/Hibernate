package com.xworkz.camera.tester;


import java.util.ArrayList;
import java.util.List;

import com.xworkz.camera.dao.CameraDAO;
import com.xworkz.camera.dao.CameraDAOImpl;
import com.xworkz.camera.entity.CameraEntity;

public class SaveList {

	public static void main(String[] args) {
		CameraEntity dto = new CameraEntity("Panasonic", "SONY", "ILCE", "BLACK", 457790, "Prime", "Wide-length",
				"Square=Frame", "20Mpx");
		CameraEntity dto1 = new CameraEntity("CANON-CAMERA", "canon", "ILCE", "BLACK", 267790, "Prime", "Mirrorlense",
				"Round=Frame", "18MPx");
		
		CameraDAO dao = new CameraDAOImpl();
		List<CameraEntity> list = new ArrayList<CameraEntity>();
		list.add(dto1);
		list.add(dto);

		dao.saveList(list);
	}
}
