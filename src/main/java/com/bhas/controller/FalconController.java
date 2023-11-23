package com.bhas.controller;

import com.bhas.dto.ResponseDTO;
import com.bhas.modal.Employee;
import com.bhas.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/falcon")
public class FalconController
{
    // DI,
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public String greetMsg()
    {
        System.out.println("\n*************\n");
        return "Welcome to the Falcon Applications!,";
    }

    @GetMapping("/getName/{name}")
    @ResponseStatus(code = HttpStatus.TOO_MANY_REQUESTS)
    public String getName(String name)
    {
        System.out.println("\n*************\n");
        return "Hello "+name;
    }

    // API for db operations,
    // 1. postRequest for sending the data,
    @PostMapping("/insertEmployee")
    public ResponseEntity<ResponseDTO> insertEmployee(@RequestBody Employee emp)
    {
        ResponseDTO responseDTO = new ResponseDTO("Details saved to db successfully,",employeeService.insertEmployee(emp));
        return new ResponseEntity<>(responseDTO,HttpStatus.ACCEPTED);
    }

    // 2. getRequest for receiving the data,
    @GetMapping("/getEmployees")
    public ResponseEntity<ResponseDTO> getEmployees()
    {
        ResponseDTO responseDTO = new ResponseDTO("Employees found,",employeeService.getEmployees());
        return new ResponseEntity<>(responseDTO,HttpStatus.FOUND);
    }

    // 2.a getById,
    @GetMapping("/getEmployee/{empId}")
    public ResponseEntity<ResponseDTO> getEmpById(@PathVariable int empId)
    {
        ResponseDTO responseDTO = new ResponseDTO("Employee found,",employeeService.getEmployeeById(empId));
        return new ResponseEntity<>(responseDTO,HttpStatus.TOO_EARLY);

    }
}
