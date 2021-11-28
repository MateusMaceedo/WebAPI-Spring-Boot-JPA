package com.base.rest.api.baserestapi.resources.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import javax.servlet.http.HttpServletRequest;
import com.base.rest.api.baserestapi.services.exceptions.DataIntegratyViolationException;
import com.base.rest.api.baserestapi.services.exceptions.ObjectNotFoundException;
import java.time.LocalDateTime;

@ControllerAdvice
public class ResourceEcxeptionHandler {

  @ExceptionHandler(ObjectNotFoundException.class)
  public ResponseEntity<StandardError>objectNotFound(ObjectNotFoundException ex, HttpServletRequest request) {
      StandardError error =
              new StandardError(LocalDateTime.now(), HttpStatus.NOT_FOUND.value(), ex.getMessage(), request.getRequestURI());
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
  }

  @ExceptionHandler(DataIntegratyViolationException.class)
  public ResponseEntity<StandardError>dataIntegrityViolationException(DataIntegratyViolationException ex, HttpServletRequest request) {
      StandardError error =
              new StandardError(LocalDateTime.now(), HttpStatus.BAD_REQUEST.value(), ex.getMessage(), request.getRequestURI());
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
  }
}
