package com.bosch.productapp.exception;

public class ProductValidationException extends ProductException{
    public ProductValidationException() {
        super();
    }

    public ProductValidationException(String message) {
        super(message);
    }

    public ProductValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}
