package com.workintech.zoo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class RestExceptionHandler {
    public ResponseEntity<AnimalErrorResponse> handleException(AnimalException exception){
        AnimalErrorResponse response = new AnimalErrorResponse(exception.getStatus().value),
                exception.getMessage(),System.currentTimeMillis();
        return new ResponseEntity<>(response,exception.getStatus());
    }
    @ControllerAdvice
    public class RestExceptionHandler {
        public ResponseEntity<AnimalErrorResponse> handleException(Exception exception){
            AnimalErrorResponse response = new AnimalErrorResponse(HttpStatus.BAD_REQUEST.value(),
            exception.getMessage(),System.currentTimeMillis();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
}
