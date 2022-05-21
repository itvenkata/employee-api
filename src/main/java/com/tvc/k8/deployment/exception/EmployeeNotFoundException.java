package com.tvc.k8.deployment.exception;

public class EmployeeNotFoundException extends RuntimeException {

  public EmployeeNotFoundException(Integer empid) {
    super("could not find employee with empid: '" + empid + "'");
  }
}
