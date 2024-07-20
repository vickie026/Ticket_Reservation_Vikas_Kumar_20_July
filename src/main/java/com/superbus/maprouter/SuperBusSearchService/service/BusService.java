package com.superbus.maprouter.SuperBusSearchService.service;

import com.superbus.maprouter.SuperBusSearchService.exceptions.AdminException;
import com.superbus.maprouter.SuperBusSearchService.exceptions.BusException;
import com.superbus.maprouter.SuperBusSearchService.model.Bus;

import java.util.List;

public interface BusService {
    //admin methods
    public Bus addBus(Bus bus, String key) throws BusException , AdminException;
    public Bus updateBus(Bus bus, String key) throws BusException, AdminException;
    public Bus deleteBus(Integer busId, String key) throws BusException, AdminException;

    //admin + user methods
    public Bus viewBus(Integer busId) throws BusException;
    public List<Bus> viewBusByBusType(String busType) throws BusException;
    public List<Bus> viewAllBuses() throws BusException;
}
