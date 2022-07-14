package com.demo.employees.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.employees.dao.EmployeeRepository;
import com.demo.employees.handlers.RecordNotFoundException;
import com.demo.employees.model.Employee;

/**
 * @author ADMIN
 *
 */
@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public Employee save(Employee employee) {
		if (employee.getId() == null) {
			employee = employeeRepository.save(employee);
			return employee;
		} else {
			Optional<Employee> employeeOptional = employeeRepository.findById(employee.getId());

			if (employeeOptional.isPresent()) {
				Employee newEntity = employeeOptional.get();
				newEntity.setFirstName(employee.getFirstName());
				newEntity.setLastName(employee.getLastName());

				newEntity = employeeRepository.save(newEntity);

				return newEntity;
			} else {
				throw new RecordNotFoundException("No employee record exist for given id");
			}
		}
	}
        // to retive all the records from the db
	public List<Employee> findAll() {
		List<Employee> result = (List<Employee>) employeeRepository.findAll();

		if (result.size() > 0) {
			return result;
		} else {
			return new ArrayList<Employee>();
		}
	}

	public void deleteById(Integer id) {
		Optional<Employee> employee = employeeRepository.findById(id);

		if (employee.isPresent()) {
			employeeRepository.deleteById(id);
		} else {
			throw new RecordNotFoundException("No employee record exist for given id");
		}
	}

	void deleteAll() {
		employeeRepository.deleteAll();
	}
}
