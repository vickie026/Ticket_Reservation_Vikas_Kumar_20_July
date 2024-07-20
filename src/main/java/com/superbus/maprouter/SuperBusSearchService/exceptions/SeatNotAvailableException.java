package com.superbus.maprouter.SuperBusSearchService.exceptions;

import lombok.Getter;

@Getter
public class SeatNotAvailableException extends Exception {
    String message;
    public SeatNotAvailableException(String message) {
        super(message);
        this.message = message;
    }

}
