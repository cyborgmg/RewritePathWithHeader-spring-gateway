package com.javainuse.exception;

import org.springframework.http.HttpStatus;

public class BadGatewayException extends GatewayException {

    public BadGatewayException(final String message) {
        super(message, HttpStatus.BAD_GATEWAY);
    }
}
