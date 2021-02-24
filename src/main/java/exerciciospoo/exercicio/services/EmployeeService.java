package exerciciospoo.exercicio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exerciciospoo.exercicio.entities.Employee;
import exerciciospoo.exercicio.repositories.EmployeeRepository;

@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository repEmployee;

    public List<Employee> getAllEmployees(){
        return repEmployee.findAll();
    }

}
