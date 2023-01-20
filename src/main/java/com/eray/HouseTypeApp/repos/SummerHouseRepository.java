package com.eray.HouseTypeApp.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.eray.HouseTypeApp.entities.House;
import com.eray.HouseTypeApp.entities.SummerHouse;
@Repository
public interface SummerHouseRepository extends JpaRepository<SummerHouse, Long> {
	@Query(value = "SELECT SUM(price) as total_price FROM summerhouses", nativeQuery = true)
	List<SummerHouse> listSummerHouseTotalPrice();
	@Query(value = "SELECT AVG(squareMeters) as avg_squareMeters FROM summerhouses", nativeQuery = true)
	List<SummerHouse> listSummerHouseAvgSquareMeters();
}
