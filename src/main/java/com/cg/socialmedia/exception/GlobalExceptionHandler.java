package com.cg.socialmedia.exception;

import com.cg.socialmedia.dto.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class GlobalExceptionHandler {

    // USER NOT FOUND
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorDTO> handleUserNotFound(UserNotFoundException ex) {
        return new ResponseEntity<>(
                new ErrorDTO(ex.getMessage(), 404),
                HttpStatus.NOT_FOUND
        );
    }

    // POST NOT FOUND
    @ExceptionHandler(PostNotFoundException.class)
    public ResponseEntity<ErrorDTO> handlePostNotFound(PostNotFoundException ex) {
        return new ResponseEntity<>(
                new ErrorDTO(ex.getMessage(), 404),
                HttpStatus.NOT_FOUND
        );
    }

    // GENERIC EXCEPTION
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDTO> handleGeneric(Exception ex) {
        return new ResponseEntity<>(
                new ErrorDTO(ex.getMessage(), 500),
                HttpStatus.INTERNAL_SERVER_ERROR
        );
    }
}