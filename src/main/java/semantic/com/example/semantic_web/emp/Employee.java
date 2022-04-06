package semantic.com.example.semantic_web.emp;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="EmployeeType")
public abstract class Employee {


    @Id
    @GeneratedValue
    private long id;

    private String name;


    public Employee() {
    }

    public Employee(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
