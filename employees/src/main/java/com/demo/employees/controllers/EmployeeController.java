package com.demo.employees.controllers;

import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.demo.employees.model.Employee;
import com.demo.employees.services.EmployeeService;

/**
 * @author ADMIN
 *
 */
@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	
	/** Functionality for adding the records in db  2022--2030
	 * @param employee
	 * @return
	 */
	@PostMapping("/employee")
	Employee create(@RequestBody Employee employee) {
		return employeeService.save(employee);
	}

	/**
	 * @return
	 */
	@GetMapping("/employee")
	Iterable<Employee> read() {
		return employeeService.findAll();
	}

	/**
	 * @param employee
	 * @return
	 */
	@PutMapping("/employee")
	Employee update(@RequestBody Employee employee) {
		return employeeService.save(employee);
	}

	/**
	 * @param id
	 */
	@DeleteMapping("/employee/{id}")
	void delete(@PathVariable Integer id) {
		employeeService.deleteById(id);
	}

	/**
	 * @return
	 */
	@GetMapping("/wrong")
	Employee somethingIsWrong() {
		throw new ValidationException("Something is wrong");
	}

	/**
	 * @param e
	 * @return
	 */
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(ValidationException.class)
	String exceptionHandler(ValidationException e) {
		return e.getMessage();
	}
}
