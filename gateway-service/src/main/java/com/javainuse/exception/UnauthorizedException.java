package com.javainuse.exception;

import org.springframework.http.HttpStatus;

public class UnauthorizedException extends GatewayException {
    public UnauthorizedException(final String message) {
        super(message, HttpStatus.UNAUTHORIZED);
    }
}
