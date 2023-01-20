package com.eray.HouseTypeApp.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.eray.HouseTypeApp.entities.Villa;
@Repository
public interface VillaRepository extends JpaRepository<Villa, Long>{
	@Query(value = "SELECT SUM(price) as total_price FROM villas", nativeQuery = true)
	List<Villa> listVillaTotalPrice();
	@Query(value = "SELECT AVG(squareMeters) as avg_squareMeters FROM villas", nativeQuery = true)
	List<Villa> listVillaAvgSquareMeters();
	@Query(value = "SELECT * FROM villas WHERE room_count = ?1 ", nativeQuery = true)
	List<House> listVillasRoomCount(int roomCount);
}
