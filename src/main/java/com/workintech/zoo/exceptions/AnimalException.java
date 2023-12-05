package com.workintech.zoo.exceptions;

import org.springframework.http.HttpStatus;

public class AnimalException extends RuntimeException{
    private HttpStatus status;
}
