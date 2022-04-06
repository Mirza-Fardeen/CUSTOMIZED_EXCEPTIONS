package semantic.com.example.semantic_web.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/postemployees")
    public void postemployees(@RequestBody PartTimeEmployee  employee , BigDecimal hourlyWage){
        PartTimeEmployee pr = new PartTimeEmployee(employee.getName(),hourlyWage);
        employeeRepository.insertEmployee(pr);
    }

    @GetMapping("/getemployees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.getEmployees();
    }

    @GetMapping("/getPartTimeemployees")
    public List<Employee> gePartTimeEmployees(){
        return employeeRepository.getPartTimeEmployees();
    }

}
