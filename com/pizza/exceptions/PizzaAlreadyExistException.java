package com.pizza.exceptions;

public class PizzaAlreadyExistException extends Exception {

    public PizzaAlreadyExistException() {
        super();
    }

    public PizzaAlreadyExistException(String message) {
        super(message);
    }

    public PizzaAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public PizzaAlreadyExistException(Throwable cause) {
        super(cause);
    }
    
}
