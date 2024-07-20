package com.superbus.maprouter.SuperBusSearchService.model;

import lombok.Data;

@Data
public class GenericResponse <T> {
    private String status;
    private String message;
    private T response;
}
