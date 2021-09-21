package com.xworkz.flats.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "apartment_table")
public class ApartmentEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "A_ID")
	private int id;
	@Column(name = "A_NAME")
	private String name;
	@Column(name = "A_LOCATION")
	private String location;
	@Column(name = "A_NOOFFLOORS")
	private int noOfFloors;
	@Column(name = "A_LIFTAVAILABLE")
	private boolean liftAvailable;
	@Column(name = "A_PRICE")
	private double price;

	public ApartmentEntity() {
		System.out.println("apartment bean created");
	}

	public ApartmentEntity(int id, String name, String location, int noOfFloors, boolean liftAvailable, double price) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.noOfFloors = noOfFloors;
		this.liftAvailable = liftAvailable;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ApartmentEntity [id=" + id + ", name=" + name + ", location=" + location + ", noOfFloors=" + noOfFloors
				+ ", liftAvailable=" + liftAvailable + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApartmentEntity other = (ApartmentEntity) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public boolean isLiftAvailable() {
		return liftAvailable;
	}

	public void setLiftAvailable(boolean liftAvailable) {
		this.liftAvailable = liftAvailable;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
}