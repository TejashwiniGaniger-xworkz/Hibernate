package com.xworkz.camera.dao;

import java.util.List;

import com.xworkz.camera.entity.CameraEntity;

public interface CameraDAO {
	int save(CameraEntity entity);

	CameraEntity readCameraEntitybyId(int pk);

	void updateNameById(int id, String name);

	void delete(int id);

	void saveList(List<CameraEntity> entity);
}