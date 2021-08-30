package com.xworkz.bird.dao;

import com.xworkz.bird.entity.BirdEntity;

public interface BirdDAO {
	int save(BirdEntity entity);
	BirdEntity read(int pk);
    void updateNameById(int id,String name);
    void deleteById(int id);
}
