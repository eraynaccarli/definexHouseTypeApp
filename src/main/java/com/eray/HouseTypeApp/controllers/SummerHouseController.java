package com.eray.HouseTypeApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eray.HouseTypeApp.entities.SummerHouse;
import com.eray.HouseTypeApp.services.SummerHouseService;

@RestController
@RequestMapping("/summerhouses")
public class SummerHouseController {

	@Autowired
	private SummerHouseService summerhouseService;
	
	@GetMapping("/totalPrice")
	public List<SummerHouse> listVillaTotalPrice(){
		return summerhouseService.listSummerHouseTotalPrice();
	}
	
	@GetMapping("/avgSquareMeters")
	public List<SummerHouse> listVillaAvgSquareMeters(){
		return summerhouseService.listSummerHouseAvgSquareMeters();
	}
	
	@GetMapping("/roomCount")
	public List<SummerHouse> listSummerHouseRoomCount(){
		return summerhouseService.listSummerHouseRoomCount();
	}
}
