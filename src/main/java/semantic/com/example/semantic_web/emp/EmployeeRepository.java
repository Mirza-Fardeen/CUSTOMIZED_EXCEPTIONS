package semantic.com.example.semantic_web.emp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;
@Repository
@Transactional
public class EmployeeRepository implements CommandLineRunner {

    @Autowired
    EntityManager em;

    public void insertEmployee(Employee employee){
        em.persist(employee);
    }
    public List<Employee> getEmployees(){
        List<Employee> employee =em.createQuery("select e from Employee e",Employee.class).getResultList();
        return employee;
    }
    public List<Employee> getPartTimeEmployees(){
        List<Employee> employees = em.createQuery("select e.EmployeeType from Employee e" ,Employee.class).getResultList();
        return employees;
    }

    @Override
    public void run(String... args) throws Exception {
      insertEmployee(new PartTimeEmployee("Jill", new BigDecimal(500)));
        insertEmployee(new FullTimeEmployee("Jack", new BigDecimal(6000)));
        System.out.println(getPartTimeEmployees());
    }
}
