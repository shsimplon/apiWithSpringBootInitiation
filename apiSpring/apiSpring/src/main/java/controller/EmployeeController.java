package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.Employee;
import service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	

	
	@GetMapping("/employees")
	public Iterable<Employee> getEmployees(){
		return employeeService.getAllEmployees();
	}
	
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employeeEntity) {
		
		Employee employeeAdded= employeeService.saveEmployee(employeeEntity);
		return employeeAdded;
	}
	

}
