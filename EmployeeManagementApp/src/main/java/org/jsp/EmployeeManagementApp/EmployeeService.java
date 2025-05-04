package org.jsp.EmployeeManagementApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Employee save(Employee emp) {
        return repository.save(emp);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Employee getById(Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Employee not found"));
    }
}
