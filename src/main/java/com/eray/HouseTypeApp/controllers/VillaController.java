package com.eray.HouseTypeApp.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eray.HouseTypeApp.entities.Villa;
import com.eray.HouseTypeApp.services.VillaService;

@RestController
@RequestMapping("/villas")
public class VillaController {

	@Autowired
	private VillaService villaService;
	

	@GetMapping("/totalPrice")
	public List<Villa> listVillaTotalPrice(){
		return villaService.listVillaTotalPrice();
	}
	
	@GetMapping("/avgSquareMeters")
	public List<Villa> listVillaAvgSquareMeters(){
		return villaService.listVillaAvgSquareMeters();
	}
}
