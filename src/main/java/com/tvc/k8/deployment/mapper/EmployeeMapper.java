package com.tvc.k8.deployment.mapper;


import com.tvc.k8.deployment.entity.Employee;
import com.tvc.k8.deployment.vo.EmployeeVo;
import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

  public Employee toEmployee(EmployeeVo empVO) {
    ModelMapper modelMapper = new ModelMapper();
    return modelMapper.map(empVO, Employee.class);
  }

  public EmployeeVo toEmployeeVO(Employee emp) {
    ModelMapper modelMapper = new ModelMapper();
    return modelMapper.map(emp, EmployeeVo.class);
  }

  public Employee updateEmployee(EmployeeVo sourceObject, Employee destinationObject) {
    ModelMapper mapper = new ModelMapper();
    mapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());
    mapper.map(sourceObject, destinationObject);
    return destinationObject;
  }
}
