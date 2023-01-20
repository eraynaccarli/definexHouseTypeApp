package com.eray.HouseTypeApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.eray.HouseTypeApp.entities.SummerHouse;
import com.eray.HouseTypeApp.repos.SummerHouseRepository;

public class SummerHouseService {

	@Autowired
	private SummerHouseRepository summerHouseRepository;
	
	public List<SummerHouse> listSummerHouseTotalPrice() {
		return summerHouseRepository.listSummerHouseTotalPrice();
	}

	public List<SummerHouse> listSummerHouseAvgSquareMeters() {
		return summerHouseRepository.listSummerHouseAvgSquareMeters();
	}

}
