package com.superbus.maprouter.SuperBusSearchService.exceptions;

import lombok.Getter;

@Getter
public class UnSufficientSeatsAvailabilityException extends Exception {
    private String message;
    public UnSufficientSeatsAvailabilityException(String message) {
        super(message);
        this.message = message;
    }

}
