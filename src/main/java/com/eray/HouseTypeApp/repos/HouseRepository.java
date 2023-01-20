package com.eray.HouseTypeApp.repos;



import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.eray.HouseTypeApp.entities.House;


@Repository
public interface HouseRepository extends JpaRepository<House, Long> {	
	@Query(value = "SELECT SUM(price) as total_price FROM houses", nativeQuery = true)
	List<House> listHouseTotalPrice();
	@Query(value = "SELECT AVG(squareMeters) as avg_squareMeters FROM houses", nativeQuery = true)
	List<House> listHouseAvgSquareMeters();
	@Query(value = "SELECT * FROM houses WHERE room_count = ?1 ", nativeQuery = true)
	List<House> listHouseRoomCount(int roomCount);
}
