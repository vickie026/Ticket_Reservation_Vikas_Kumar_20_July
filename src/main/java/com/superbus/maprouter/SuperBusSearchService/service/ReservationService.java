package com.superbus.maprouter.SuperBusSearchService.service;

import com.superbus.maprouter.SuperBusSearchService.exceptions.ReservationException;
import com.superbus.maprouter.SuperBusSearchService.exceptions.UserException;
import com.superbus.maprouter.SuperBusSearchService.model.Reservation;
import com.superbus.maprouter.SuperBusSearchService.model.ReservationDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReservationService {

    public Reservation addReservation(ReservationDTO dto, String key) throws ReservationException;

    public Reservation viewReservation(Integer rid, String key) throws ReservationException;

    public List<Reservation> getAllReservation(String key) throws ReservationException;

    public List<Reservation> viewReservationByUerId(Integer uid, String key) throws ReservationException;

    public Reservation deleteReservation(Integer rid, String key) throws ReservationException;

    public Reservation updateReservation(Integer rid, ReservationDTO dto, String key) throws ReservationException;

}
