package com.tvc.k8.deployment.service;


import com.tvc.k8.deployment.vo.EmployeeVo;
import java.util.List;

public interface EmployeeService {

  public EmployeeVo createEmployee(EmployeeVo empVO);

  public EmployeeVo getEmployee(Integer empId);

  public void deleteEmployee(Integer empId);

  public EmployeeVo updateEmployee(Integer empId, EmployeeVo updateEmpVO);

  public List<EmployeeVo> getAllEmployees();
}
