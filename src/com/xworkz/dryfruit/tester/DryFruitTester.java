package com.xworkz.dryfruit.tester;

import com.xworkz.dryfruit.dao.DryFruitDAO;
import com.xworkz.dryfruit.dao.DryFruitDAOImpl;
import com.xworkz.dryfruit.dto.DryFruitDTO;

public class DryFruitTester {

	public static void main(String[] args) {
		DryFruitDTO dto = new DryFruitDTO(1,"Almond","Dabur","India",500,"Dabur");
		DryFruitDAO dao = new DryFruitDAOImpl();
		dao.save(dto);

	}

}
