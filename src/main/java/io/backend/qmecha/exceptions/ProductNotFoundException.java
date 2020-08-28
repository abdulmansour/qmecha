package io.backend.qmecha.exceptions;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;

public class ProductNotFoundException extends ResourceNotFoundException {

    public ProductNotFoundException() {
        super();
    }

    public ProductNotFoundException(String message) {
        super(message);
    }

    public ProductNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
