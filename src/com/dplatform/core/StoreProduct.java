package com.dplatform.core;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class StoreProduct {
	public static void main(String[] args) {
		
		//creating configuration object
		AnnotationConfiguration cfg=new AnnotationConfiguration();  
		cfg.configure("hibernate.cfg.xml");
		//creating seession factory object
		SessionFactory factory=cfg.buildSessionFactory();
		
		//creating session object
		Session session=factory.openSession();
		
		//creating transaction object
		Transaction t=session.beginTransaction();

		PrinterProduct pp=new PrinterProduct();
		pp.setPk(1);
		pp.setCode("printercode");
		pp.setCreatedTime(new Date());
		pp.setModifiedTime(new Date());
		pp.setMaterial("Laser");
		pp.setName("3d Printer");
		session.persist(pp);
		
		MobileProduct mp=new MobileProduct();
		mp.setPk(2);
		mp.setCode("printercode");
		mp.setCreatedTime(new Date());
		mp.setModifiedTime(new Date());
		mp.setOperatingSystem("Android");
		pp.setName("Samsung");
		session.persist(mp);
		
		t.commit();//transaction is commited
		session.close();
		
		System.out.println("successfully saved");
		
	}
}
