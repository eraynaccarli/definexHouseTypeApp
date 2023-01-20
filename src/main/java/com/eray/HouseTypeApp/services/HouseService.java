package com.eray.HouseTypeApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.eray.HouseTypeApp.entities.House;
import com.eray.HouseTypeApp.repos.HouseRepository;

public class HouseService {

	@Autowired
	private HouseRepository houseRepository;
	
	public List<House> listHouseTotalPrice() {
		return houseRepository.listHouseTotalPrice();
	}

	public List<House> listHouseAvgSquareMeters() {
		// TODO Auto-generated method stub
		return houseRepository.listHouseAvgSquareMeters();
	}

	
}
