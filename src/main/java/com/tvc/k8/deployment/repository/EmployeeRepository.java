package com.tvc.k8.deployment.repository;

import com.tvc.k8.deployment.entity.Employee;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

  public Optional<Employee> findByEmail(String emailId);

  Employee findByFirstname(String username);
}
