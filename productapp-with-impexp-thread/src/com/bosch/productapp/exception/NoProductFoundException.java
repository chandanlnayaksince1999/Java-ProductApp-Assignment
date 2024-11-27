package com.bosch.productapp.exception;

public class NoProductFoundException extends ProductException{

    public NoProductFoundException() {
        super();
    }

    public NoProductFoundException(String message) {
        super(message);
    }

    public NoProductFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
