package com.alesia.validation.model;

public class InvalidUserNameException extends RuntimeException {

    public InvalidUserNameException() {
        super("Name should have min 3 symbols and max 15 symbols");
    }
}
