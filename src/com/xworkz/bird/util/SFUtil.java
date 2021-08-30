package com.xworkz.bird.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SFUtil {
   private static SessionFactory factory;
   public static SessionFactory getFactory() {
	   if(factory!= null && factory.isClosed()) {
		   throw new IllegalStateException("someone closed");
	   }
	   return factory;
	   
   }
   static {
	   try {
		   
	   System.out.println("SF INIT STARTED");
	   Configuration configuration = new Configuration().configure();
	   factory = configuration.buildSessionFactory();
	   System.out.println("SSSF INIT COMPLETED");
	   
   }catch(HibernateException e) {
	   System.out.println("SF ERROR INSTATIC BLOCK");
	   e.printStackTrace();
   }
}
}