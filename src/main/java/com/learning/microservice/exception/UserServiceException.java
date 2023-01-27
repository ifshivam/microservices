package com.learning.microservice.exception;

import java.io.Serial;

public class UserServiceException extends RuntimeException{
    @Serial
    private static final long serialVersionUID=212169553458878340L;

    public UserServiceException(String message){
        super(message);
    }
}
