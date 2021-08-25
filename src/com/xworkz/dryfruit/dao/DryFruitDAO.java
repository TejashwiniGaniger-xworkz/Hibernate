package com.xworkz.dryfruit.dao;

import com.xworkz.dryfruit.dto.DryFruitDTO;

public interface DryFruitDAO {
  
	int save(DryFruitDTO entity);
	int create(DryFruitDTO entity);

	int update(DryFruitDTO entity);

	int delete(DryFruitDTO entity);
}
