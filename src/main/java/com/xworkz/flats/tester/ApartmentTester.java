package com.xworkz.flats.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.flats.dao.ApartmentDAO;
import com.xworkz.flats.dao.ApartmentDAOImpl;
import com.xworkz.flats.entity.ApartmentEntity;
import com.xworkz.flats.service.ApartmentService;
import com.xworkz.flats.service.ApartmentServiceImpl;

public class ApartmentTester {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ApartmentDAO dao = context.getBean(ApartmentDAO.class);
		ApartmentEntity entity=new ApartmentEntity();
		entity.setName("Prestige");
		entity.setLocation("Bangalore");
		entity.setNoOfFloors(30);
		entity.setPrice(2);
		entity.setLiftAvailable(true);
		dao.save(entity);
		System.out.println("****************************************************************************");
		ApartmentService serv = new ApartmentServiceImpl();
		serv.save(entity);
		
	}

}
