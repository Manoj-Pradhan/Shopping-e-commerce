package com.example.jazzy_kart.exception;

public class OutOfResourceException extends RuntimeException{
    public OutOfResourceException(String message) {
        super(message);
    }

    public OutOfResourceException() {
        super("Out Of Stuck");
    }


}
