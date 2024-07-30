package Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("uvw","xyz","abcd","efg","hijk","lmnop","rst");
        String[] strs = list.toArray(String[]::new);
        System.out.println(Arrays.toString(strs));
        var id = 244;
        System.out.println(id);

        //list.stream().sorted().forEach(System.out::println);

        //list.stream().filter(str->str.contains("a")).sorted().forEach(System.out::println);

        List<String> strings = list.stream().filter(str -> str.contains("z")).sorted().toList();

        //list.stream().filter(str->str.contains("j")).limit(4).forEach(System.out::println);

        List<Integer> data = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Optional<Integer> multiply = data.stream().reduce((a,b)->a*b);
        //System.out.println(multiply.get());

        Optional<Integer> sum =data.stream().reduce((a, b) -> a + b);
        //here data.stream().reduce(Integer::sum);//is modified to Method Reference
        //Approach 2
        int sum1 = data.stream().mapToInt(i -> i).sum();

        //find Average of list
        double average = data.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println(average);

        List<Integer> list1 = Arrays.asList (1,10,20,30,15);
//1 100 400 900 225 (e*е)
//400 900 225
//1525/3 = 508.33333
        double avg = list1.stream().map(e -> e * e)
                .filter(e -> e > 10)
                .filter(e->e>=900).mapToInt(e -> e).average().getAsDouble();
        System.out.println(avg);

        //Find even odd in list
        List<Integer> even = data.stream().filter(e -> e % 2 == 0).toList();
        System.out.println(even);
        //same for odd e%2!=0

        //Find numbers starting with 3
        List<Integer> nums = Arrays.asList(3,36,33,43,53,63,73,83,39);
        List<Integer> nums2 = nums.stream().map(e -> String.valueOf(e)).filter(e -> e.startsWith("3")).map(e -> Integer.valueOf(e)).collect(Collectors.toList());
        System.out.println(nums2);

        //Find repeated numbers
        //List<Integer> dup = Arrays.asList(1,2,3,3,4,5,6,6,7,8,9,9,9,10,11,12,13,14,15,21,15,1,12);
        int []arr = {1,2,3,3,4,5,6,6,7,8,9,9,9,10,11,12,13,14,15,21,15,1,12};
        double arrAvg = Arrays.stream(arr).boxed().mapToInt(a -> a).average().getAsDouble();
        //List<Integer> dup = new ArrayList<>(Arrays.asList(1,2,3,3,4,5,6,6,7,8,9,9,9,10,11,12,13,14,15,21,15,1,12));
        List<Integer> dup = new ArrayList<>(Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new)));
        //i -> new Integer[i], i -> Integer.valueOf(i), Integer::valueOf
        dup.remove(Integer.valueOf(21));
        Set<Integer> set2 = Arrays.stream(arr).boxed().filter(e -> Collections.frequency(Arrays.asList(arr), e) > 1).collect(Collectors.toSet());
        Set<Integer> set = dup.stream().filter(e -> Collections.frequency(dup, e) > 1).collect(Collectors.toSet());
        System.out.println(set);
        //or
        Set<Integer> dupNum = new HashSet<>();
        Set<Integer> set1 = dup.stream().filter(e -> !dupNum.add(e)).collect(Collectors.toSet());
        System.out.println(set1);

        //Find min max
        Integer max = dup.stream().max(Comparator.comparing(e -> Integer.valueOf(e))).get();

        //Sort in Desc
        List<Integer> desc = dup.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(desc);

        //09 - Get/ignore first 5 numbers using Limit & Skip in Streams
        //get first 5 numbers
        List<Integer> five = dup.stream().limit(5).collect(Collectors.toList());
        System.out.println(five);
        //Sum of first 5
        int fiveSum = dup.stream().limit(5).reduce((a,b)->a+b).get();
        System.out.println(fiveSum);
        //Skip first 5
        List<Integer> skip = dup.stream().skip(9).collect(Collectors.toList());
        System.out.println(skip);
        Integer skipSum = dup.stream().skip(9).reduce((a, b) -> a + b).get();
        System.out.println(skipSum);

        //10 - Get Second Highest/Lowest Number using Streams
        Integer secondHighest = dup.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
        Integer secondHigh = dup.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(secondHighest);

        //Infosys Interview: reduce list of int by 3
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,9,12);
        List<Integer> distinct = numbers.stream().map(i -> i -1).distinct().toList();
        System.out.println(distinct);
        long count = numbers.stream().distinct().count();
        System.out.println(count);
        //flatmap
        List<Integer> list2 = numbers.stream().flatMap(i -> Stream.of(i - 10, i + 10,i+100)).distinct().toList();
        var arr1 = new int[]{2, 12, 90};
        var arr2 = new int[]{13, 7, 1};
        Stream.of(arr1,arr2).flatMapToInt(IntStream::of).max().ifPresent(System.out::println);
        int []array = {5, 9, 11, 2, 8, 21, 1};
        Integer second = Arrays.stream(array).boxed().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(second);

        List<Integer> ids = Arrays.asList(1,2,3,4,5,6,7,8,9);
        //ids.forEach(System.out::println);
        List<Employee> employeeList = Arrays.asList(
                new Employee(12303, "Ajaz",'M', "IT", 30000.0,List.of(new Address("AP","Guntur","Flat 310",522001),new Address("AP","Mangalagiri","1-479",522503),new Address("Telengana","Hyderabad","Gachibowli",500032))),
                new Employee(12304, "Bean",'M', "IT", 30000.0, List.of(new Address("AP", "Guntur", "Flat 310", 522001))),
                new Employee(12303, "Jenny", 'F',"IT", 60000.0,List.of(new Address("Telengana","Hyderabad","Gachibowli",500032))),
                new Employee(12303, "Emma", 'F',"Finance", 10000.0,List.of(new Address("Telengana","Hyderabad","Gachibowli",500032))),
                new Employee(12303, "Bond",'M',"IT",40000.0,List.of(new Address("Telengana","Hyderabad","Gachibowli",500032))),
                new Employee(10005, "Susen",'F', "Finance", 40000.0,List.of(new Address("Telengana","Hyderabad","Gachibowli",500032))),
                new Employee(11106, "Hank",'M', "Risk", 10000.0,List.of(new Address("Telengana","Hyderabad","Gachibowli",500032))),
                new Employee(11009, "Sully",'M', "Surveillance", 70000.0,List.of(new Address("Telengana","Hyderabad","Gachibowli",500032))),
                new Employee(10007, "Adam",'M', "Management", 80000.0,List.of(new Address("Telengana","Hyderabad","Gachibowli",500032))),
                new Employee(12303,"Anny", 'F',"Banking",20000.0,List.of(new Address("Telengana","Hyderabad","Gachibowli",500032)))
        );
        Map<String, List<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDeptName));
        //collect.forEach((a,b)-> System.out.println(a+"->"+b));
        Map<String, Integer> deptEmpCountMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()))
                .entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().intValue()));
        System.out.println("DeptEmpCountMap:"+deptEmpCountMap);
        String city="Hyderabad";
        //List<Employee> hyderabadi = employeeList.stream().filter(a -> a.getAddresses().stream().anyMatch(address -> address.getCity().equals(city))).collect(Collectors.toList());
        //To handle nulls
//        List<Employee> employeesInCity = employeeList.stream()
//                .filter(employee -> employee.getAddresses().stream()
//                        .anyMatch(address -> Optional.ofNullable(address)
//                                .map(Address::getCity)
//                                .orElse("").equals(city)))
//                .collect(Collectors.toList());
        List<Employee> employeesInCity = employeeList.stream()
                .filter(employee -> Optional.ofNullable(employee)
                        .map(Employee::getAddresses)
                        .orElse(Collections.emptyList()).stream()
                        .anyMatch(address -> Optional.ofNullable(address)
                                .map(Address::getCity)
                                .orElse("").equals(city)))
                .collect(Collectors.toList());
        //System.out.println(hyderabadi);
        System.out.println(employeesInCity);
        //CGI
        //1.Find freq of all characters using streams
        String s = "the quick brown fix jumps over a lazy dog";
        Map<Character,Long> map = s.chars().filter(a->a!=' ').mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
        //2.Get Employees with highest salary from each dept
        Map<String, List<Employee>> deptMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getDeptName));
        deptMap.forEach((a,b)-> System.out.println(a+"->"+b));
        Map<String, List<Employee>> highSalariedEmployees = deptMap.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, a -> a.getValue().stream().filter(e -> e.getSalary() >=10000).collect(Collectors.toList())));
        System.out.println("highSalariedEmployees");
        highSalariedEmployees.forEach((a,b)-> System.out.println(a+"->"+b));
        Optional<Employee> maxSalariedEmployee = employeeList.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(maxSalariedEmployee);
        //Highest paid employee from each department
        Map<String, Optional<Employee>> highestPaidEmployeeByDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        highestPaidEmployeeByDept.forEach((dept, emp) -> {
            System.out.println("Department: " + dept);
            System.out.println("Highest Paid Employee: " + emp.get().getEmployeeName() + ", Salary: " + emp.get().getSalary());
        });
        //same with sql
        //SELECT e.Department, e.EmployeeID, e.EmployeeName, e.Salary
        //FROM Employees e
        //INNER JOIN (
        //  SELECT Department, MAX(Salary) AS MaxSalary
        //  FROM Employees
        //  GROUP BY Department
        //) em
        //ON e.Department = em.Department AND e.Salary = em.MaxSalary
        //Find avg of a student marks
        //SELECT name, AVG(sub) AS avg_sub FROM student GROUP BY name;

        List<Employee> filterdEmployeesWithMap = employeeList.stream().map(a -> new Employee(a.getEmployeeId(), a.getEmployeeName(), a.getGender(), a.getDeptName(), a.getSalary() * 1.1, a.getAddresses()))
                .filter(e -> e.getSalary() < 20000)
                .collect(Collectors.toList());
        System.out.println(filterdEmployeesWithMap);
        //This filteredEmployeesEffectingOriginalList will affect original employeeList
//        List<Employee> filteredEmployeesEffectingOriginalList = employeeList.stream()
//                .peek(e -> e.setSalary(e.getSalary() * 1.1)) // add a 10% hike to all employees
//                .filter(e -> e.getSalary() < 20000) // filter employees with salary < 20k
//                .collect(Collectors.toList());
//        System.out.println(filteredEmployeesEffectingOriginalList);
//        .peek not working giving old salary after hike
//        List<Employee> hikeForExistingEmployees = employeeList.stream()
//                .peek(a -> {
//                    double updatedSalary = a.getSalary() * 1.1; // add a 10% hike to salary
//                    a = new Employee(a.getEmployeeId(), a.getEmployeeName(), a.getGender(), a.getDeptName(), updatedSalary, a.getAddresses()); // create new instance with updated salary
//                })
//                .filter(e -> e.getSalary() < 20000) // filter employees with salary < 20k
//                .collect(Collectors.toList());
//        System.out.println(hikeForExistingEmployees);
        System.out.println(employeeList.stream().filter(a->a.getEmployeeName().equals("Emma")).collect(Collectors.toList()));

    }
}
