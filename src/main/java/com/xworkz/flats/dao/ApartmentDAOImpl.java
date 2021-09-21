package com.xworkz.flats.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.flats.entity.ApartmentEntity;

@Component
public class ApartmentDAOImpl  implements ApartmentDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	public ApartmentDAOImpl() {
		super();
		System.out.println(this.getClass().getSimpleName() + "bean created");
	}


	@Override
	public void save(ApartmentEntity entity) {
		try (Session session = sessionFactory.openSession()) {
			Transaction trans = session.beginTransaction();
			session.save(entity);
			session.flush();
			session.clear();

			trans.commit();
		}

	}
		
	}
	


