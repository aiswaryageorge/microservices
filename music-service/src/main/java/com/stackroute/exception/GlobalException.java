package com.stackroute.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    @ExceptionHandler(value = GlobalException.class)

    public ResponseEntity<Object> exception(GlobalException exception) {

        return new ResponseEntity<>("Track Not Found!", HttpStatus.NOT_FOUND);
    }
}
