package com.xworkz.flats.service;

import com.xworkz.flats.dao.ApartmentDAO;
import com.xworkz.flats.dao.ApartmentDAOImpl;
import com.xworkz.flats.entity.ApartmentEntity;


public class ApartmentServiceImpl implements ApartmentService {
	
	ApartmentDAO dao =new ApartmentDAOImpl();

	@Override
	public int save(ApartmentEntity entity) {
		
		boolean nameValid=false;
		boolean locationValid=false;
		boolean noOffloarsValid=false;
		boolean liftAvailableValid=false;
		boolean priceValid=false;
		
		if (entity != null) {
			System.out.println("Entity is not null,will start validating");
			String name = entity.getName();
			if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 30) {
				System.out.println("name is valid");
				nameValid = true;
			} else {
				System.out.println("name is invalid");
				nameValid = false;
			}
			String location = entity.getLocation();
			if (location != null && !location.isEmpty() && location.length() >= 3 && location.length() <= 30) {
				System.out.println("location is valid");
				locationValid = true;
			} else {
				System.out.println("location is invalid");
				locationValid = false;
			}
			int noOffloars = entity.getNoOfFloors();
			if (noOffloars != 0 && noOffloars >= 4 && noOffloars <= 100) {
				System.out.println("noOffloars is valid");
				noOffloarsValid = true;
			} else {
				System.out.println("noOffloars is invalid");
				noOffloarsValid = false;
			}
			Boolean liftAvailable = entity.isLiftAvailable();
			if (liftAvailable != false) {
				System.out.println("Married is valid");
				liftAvailable = true;
			} else {
				System.out.println("Married is invalid");
				liftAvailable =false;
			}
			double price = entity.getPrice();
			if (price != 0 && price  >= 0 && price <= 100) {
				System.out.println("price is valid");
				priceValid = true;
			} else {
				System.out.println("price is invalid");
				priceValid = false;
				}
		
	}
		return 2204;

}}
