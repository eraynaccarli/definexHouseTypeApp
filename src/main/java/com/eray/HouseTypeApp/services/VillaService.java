package com.eray.HouseTypeApp.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.eray.HouseTypeApp.entities.Villa;
import com.eray.HouseTypeApp.repos.VillaRepository;

public class VillaService {

	@Autowired
	private VillaRepository villaRepository;
	
	
	public List<Villa> listVillaTotalPrice() {
		return villaRepository.listVillaTotalPrice();
	}


	public List<Villa> listVillaAvgSquareMeters() {
		return villaRepository.listVillaAvgSquareMeters();
	}
	
	public List<Villa> listVillaRoomCount() {
		return villaRepository.listVillasRoomCount();
	}

}
