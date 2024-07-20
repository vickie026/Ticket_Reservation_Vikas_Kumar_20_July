package com.superbus.maprouter.SuperBusSearchService.repositories;

import com.superbus.maprouter.SuperBusSearchService.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
}
