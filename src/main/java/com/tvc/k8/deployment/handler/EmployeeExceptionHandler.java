package com.tvc.k8.deployment.handler;


import com.tvc.k8.deployment.exception.EmployeeAlreadyExistsException;
import com.tvc.k8.deployment.exception.EmployeeNotFoundException;
import com.tvc.k8.deployment.exception.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class EmployeeExceptionHandler {

  @ResponseBody
  @ExceptionHandler(EmployeeNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  ErrorResponse empNotFoundExceptionHandler(EmployeeNotFoundException ex) {
    return new ErrorResponse("error", ex.getMessage());
  }

  @ResponseBody
  @ExceptionHandler(EmployeeAlreadyExistsException.class)
  @ResponseStatus(HttpStatus.CONFLICT)
  ErrorResponse employeeAlreadyExistsExceptionHandler(EmployeeAlreadyExistsException ex) {
    return new ErrorResponse("error", ex.getMessage());
  }
}
