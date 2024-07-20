package com.superbus.maprouter.SuperBusSearchService.exceptions;

import lombok.Getter;

@Getter
public class InvalidSeatNoException extends Exception {
    private String message;

    public InvalidSeatNoException(String message) {
        super(message);
        this.message = message;
    }
}
