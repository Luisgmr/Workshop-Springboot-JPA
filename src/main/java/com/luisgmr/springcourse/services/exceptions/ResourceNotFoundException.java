package com.luisgmr.springcourse.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id) {
        super("Recurso (resource) não encontrado. Id " + id);
    }

}
