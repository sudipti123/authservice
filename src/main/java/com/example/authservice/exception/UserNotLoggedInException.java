package com.example.authservice.exception;

public class UserNotLoggedInException extends RuntimeException{
    public UserNotLoggedInException( String message) {
        super(message);
    }
}
