package Epam;

import java.util.*;

//	1. Hashing: When you put a key-value pair into a HashMap, it uses the key’s hashCode method to compute a hash value.
//	This hash value is used to determine the bucket in which the entry will be stored.
//	2. Buckets: The HashMap maintains an array of buckets. Each bucket is essentially a linked list of entries that have the same hash value.
//	If multiple keys hash to the same bucket, they are stored in that bucket in a linked list structure.
//	3. Equals Method: When retrieving a value from a HashMap, the hashCode is used to find the right bucket,
//	and then the equals method is used to find the exact key within that bucket.

class Employee {
    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //By overriding hashCode to always return 1, all Employee instances will have the same hash code.
    //This means all entries will be placed in the same bucket,
    //leading to poor performance due to increased time complexity for retrieval and insertion operations.
    @Override
    public int hashCode() {
        return Objects.hash(id,name,age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id && age == employee.age && Objects.equals(name, employee.name);
    }
}

class Main {
    public static void main(String[] args) {
        HashMap<Employee, String> employeeMap = new HashMap<>();

        Employee emp1 = new Employee(1, "John", 30);
        Employee emp2 = new Employee(2, "Alice", 25);
        Employee emp3 = new Employee(3, "Jack", 26);
        Employee emp4 = new Employee(4, "Sam", 28);

        employeeMap.put(emp1, "Manager");
        employeeMap.put(emp2, "Engineer");
        employeeMap.put(emp3, "Developer");
        employeeMap.put(emp4, "Tester");

        Employee lookupEmployee = new Employee(1, "John", 30);

        String roleManager = employeeMap.get(lookupEmployee);

        Employee lookupEmployee2 = new Employee(2, "Alice", 25);
        String roleEngineer = employeeMap.get(lookupEmployee2);
        System.out.println("Employee roleManager: " + roleManager); //
        System.out.println("Employee roleEngineer: " + roleEngineer); //
        System.out.println("HashMap size:" + employeeMap.size()); //
    }
}

