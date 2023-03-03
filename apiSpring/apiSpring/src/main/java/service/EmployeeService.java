package service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import model.Employee;
import repository.EmployeeRepository;

@Data
@Service
public class EmployeeService {
	
	
	@Autowired
	private EmployeeRepository employeeRepository;
	public Optional<Employee> getEmplyee(final Long id){
		
		return employeeRepository.findById(id);
	}
	
	public Iterable<Employee> getAllEmployees(){
		 return employeeRepository.findAll();
	}
	
	public void deleteEmployee(final Long id){
		employeeRepository.deleteById(id);
		
	}
	
	public Employee saveEmployee(Employee employee) {
		Employee savedEmployee= employeeRepository.save(employee);
		return savedEmployee;
	}

}
