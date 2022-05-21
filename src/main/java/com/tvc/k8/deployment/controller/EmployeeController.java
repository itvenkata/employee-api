package com.tvc.k8.deployment.controller;


import com.tvc.k8.deployment.service.EmployeeServiceImpl;
import com.tvc.k8.deployment.vo.EmployeeVo;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This comment looks like javadoc but it at an invalid location. Therefore, the text will not get
 * into TestClass.html and the check will produce a violation.
 */
@RestController
@Slf4j
@RequestMapping("v1")
public class EmployeeController {

  @Autowired
  EmployeeServiceImpl employeeServiceImpl;

  @PostMapping("/create")
  public ResponseEntity<EmployeeVo> createEmployee(@RequestBody EmployeeVo emp) {
    return new ResponseEntity(employeeServiceImpl.createEmployee(emp), HttpStatus.CREATED);
  }

  @GetMapping("/{empId}")
  public ResponseEntity<EmployeeVo> getEmployee(@PathVariable Integer empId) {
    return new ResponseEntity(employeeServiceImpl.getEmployee(empId), HttpStatus.OK);
  }

  @DeleteMapping("/{empId}")
  public ResponseEntity<?> deleteEmployee(@PathVariable Integer empId) {
    employeeServiceImpl.deleteEmployee(empId);
    return new ResponseEntity(HttpStatus.NO_CONTENT);
  }

  @PutMapping("/{empId}")
  public ResponseEntity<?> updateEmployee(
      @PathVariable Integer empId, @RequestBody EmployeeVo empVo) {
    return new ResponseEntity(employeeServiceImpl.updateEmployee(empId, empVo), HttpStatus.OK);
  }

  @GetMapping("/employees")
  public ResponseEntity<List<EmployeeVo>> getAllEmployees() {
    return new ResponseEntity(employeeServiceImpl.getAllEmployees(), HttpStatus.OK);
  }
}
