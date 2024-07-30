package Java8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class Employee {

    private Integer employeeId;
    private String employeeName;
    private char gender;
    private String deptName;
    private Double salary;
    private List<Address> addresses;
    public Employee(Integer employeeId, String employeeName,char gender, String deptName, Double salary, List<Address> addresses) {
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.gender=gender;
        this.deptName = deptName;
        this.salary = salary;
        this.addresses=addresses;
    }
    public String toString() {
        return "Java8.Employee [employeeId=" + employeeId + ", employeeName= "+ employeeName +", Gender=" +gender+ ", deptName=" + deptName
                + ", salary=" + salary + ", Addresses: "+addresses+ "'";
    }
}
