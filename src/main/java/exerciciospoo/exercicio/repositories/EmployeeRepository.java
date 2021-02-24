package exerciciospoo.exercicio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import exerciciospoo.exercicio.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}
