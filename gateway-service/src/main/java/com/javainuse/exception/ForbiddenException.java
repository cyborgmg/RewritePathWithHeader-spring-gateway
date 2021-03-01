package com.javainuse.exception;

import org.springframework.http.HttpStatus;

public class ForbiddenException extends GatewayException {
    public ForbiddenException(String message) {
        super(message, HttpStatus.FORBIDDEN);
    }
}
