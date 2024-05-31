package com.profeconnect.dto.exception;

public class PasswordConfirmationException extends RuntimeException {
    public PasswordConfirmationException(){
        super("Invalid password or password confirmation");
    }
}
