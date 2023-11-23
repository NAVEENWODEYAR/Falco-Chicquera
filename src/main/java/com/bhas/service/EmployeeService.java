package com.bhas.service;

import com.bhas.modal.Employee;
import com.bhas.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService
{
    // DI,
    @Autowired
    private EmployeeRepo employeeRepo;

    // a. INSERT INTO TABLE VALUES();
    public Employee insertEmployee(Employee emp)
    {
        return employeeRepo.save(emp);
    }

    // a.1 List<Employee>,
    public List<Employee> insertEmployees(List<Employee> emp)
    {
        List<Employee> employees = employeeRepo.saveAll(emp);
        return employees;
    }

    // b. SELECT * FROM EMPLOYEE;
    public List<Employee> getEmployees()
    {
        return employeeRepo.findAll();
    }

    // c. SELECT * FROM EMPLOYEE WHERE empId="";,
    public Employee getEmployeeById(int empId)
    {
        return employeeRepo.findById(empId).get();
    }

    // d. DELETE FROM table_name WHERE condition;
    public String deleteEmpById(int empId)
    {
        employeeRepo.deleteById(empId);
    }
}
