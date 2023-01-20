package com.eray.HouseTypeApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eray.HouseTypeApp.entities.House;
import com.eray.HouseTypeApp.services.HouseService;

@RestController
@RequestMapping("/houses")
public class HouseController {

	@Autowired
	private HouseService houseService;

	@GetMapping("/totalPrice")
	public List<House> listHouseTotalPrice(){
		return houseService.listHouseTotalPrice();
	}
	
	@GetMapping("/avgSquareMeters")
	public List<House> listHouseAvgSquareMeters(){
		return houseService.listHouseAvgSquareMeters();
	}
	
}
