package net.javatatiana.springboot.springbootcrudrestfulwebservices2.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javatatiana.springboot.springbootcrudrestfulwebservices2.model.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}