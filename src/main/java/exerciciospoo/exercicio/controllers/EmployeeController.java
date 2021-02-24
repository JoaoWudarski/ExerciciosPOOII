package exerciciospoo.exercicio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import exerciciospoo.exercicio.entities.Employee;
import exerciciospoo.exercicio.services.EmployeeService;

@RestController
public class EmployeeController {
    
    @Autowired
    private EmployeeService srvcEmployee;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return srvcEmployee.getAllEmployees();
    }

}
