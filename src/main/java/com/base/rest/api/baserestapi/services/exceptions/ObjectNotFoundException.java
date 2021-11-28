package com.base.rest.api.baserestapi.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{
  public ObjectNotFoundException(String message) {
    super(message);
  }
}
