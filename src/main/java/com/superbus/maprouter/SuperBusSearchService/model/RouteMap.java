package com.superbus.maprouter.SuperBusSearchService.model;

import lombok.Data;

import java.util.Date;

@Data
public class RouteMap {
    private int id;
    private String location;
    private long arrivalTime;
    private double fair;
}
