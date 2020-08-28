package io.backend.qmecha.exceptionhandlers;


import io.backend.qmecha.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class RESTExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleNotFoundException(final ProductNotFoundException notFoundException) {
        final ErrorResponse errorResponse = new ErrorResponse(HttpStatus.NOT_FOUND.value(), notFoundException.getMessage(), LocalDateTime
                .now());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}

