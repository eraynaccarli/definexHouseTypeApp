package com.eray.HouseTypeApp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "villas")
@Entity
@Data
public class Villa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long houseId;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "squareMeters")
	private double squareMeters;
	
	@Column(name = "roomCount")
	private int roomCount;
	
	@Column(name = "livingRoomCount")
	private int livingRoomCount;
	
}
