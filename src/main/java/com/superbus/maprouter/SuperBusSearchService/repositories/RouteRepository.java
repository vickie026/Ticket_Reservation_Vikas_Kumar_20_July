package com.superbus.maprouter.SuperBusSearchService.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.superbus.maprouter.SuperBusSearchService.model.Route;
@Repository
public interface RouteRepository extends JpaRepository<Route, Integer>{
	
	public Route findByRouteFromAndRouteTo(String from,String to);	

}
