package com.pizza.exceptions;

public class NoPizzaFoundException extends Exception {
    
    public NoPizzaFoundException() {
        super();
    }

    public NoPizzaFoundException(String message) {
        super(message);
    }

    public NoPizzaFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoPizzaFoundException(Throwable cause) {
        super(cause);
    }
}
