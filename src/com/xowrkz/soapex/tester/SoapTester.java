package com.xowrkz.soapex.tester;

import com.xowrkz.soapex.constant.SoapType;
import com.xowrkz.soapex.dto.SoapDTO;
import com.xworkz.soapex.dao.SoapDAO;
import com.xworkz.soapex.dao.SoapDAOImpl;

public class SoapTester {

	public static void main(String[] args) {
		SoapDTO entity = new SoapDTO(1,"Teju","Jasmine",true,false,SoapType.BABYSOAP);
		SoapDAO dao = new SoapDAOImpl();
		dao.save(entity);

	}

}
