package com.tvc.k8.deployment.exception;

public class EmployeeAlreadyExistsException extends RuntimeException {
  public EmployeeAlreadyExistsException(Integer empid) {
    super("employee already exists for empid: '" + empid + "'");
  }

  public EmployeeAlreadyExistsException(String emailId) {
    super("employee already exists for email: '" + emailId + "'");
  }
}
