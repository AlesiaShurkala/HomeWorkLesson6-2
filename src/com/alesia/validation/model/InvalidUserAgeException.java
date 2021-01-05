package com.alesia.validation.model;

public class InvalidUserAgeException extends RuntimeException {

    public InvalidUserAgeException() {
        super("Min age should be 0 and max age should be 120");
    }
}
