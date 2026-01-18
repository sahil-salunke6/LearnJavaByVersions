package org.example.java8_features.streams;


import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsClass {

    public static void main(String[] args) {

        /*
          Generate stream from existing collection using Collection.stream()
         */

        // Convert given list of numbers to stream using stream().toList()

        List<Integer> numbers = List.of(1, 2, 3, 4, 225, 5, 6, 7, 315, 8, 9, 710, 10);

        List<Integer> list = numbers.stream().toList();// collect() to gather the final results as a list
        System.out.println("Original List: " + list);

        // Convert given Array to stream using Arrays.stream()

        String[] stringArray = {"Java", "Python", "C++", "JavaScript", "Ruby"};

        Object[] stringStream = Stream.of(stringArray).toArray();
        System.out.println("String Array Stream: " + List.of(stringStream));


        // ----------------------------------------------------------------------


        /*
          Generate stream from scratch using Stream.iterate()
          Demonstrating various Stream operations: iterate, peek, filter, map, and collect
         */

        Stream.iterate(0, x -> x + 1).limit(21)                        // iterate() to create a stream of numbers from 0 to 20
                .peek(x -> System.out.println("Generated: " + x))                   // peek() to log the generated numbers
                .filter(x -> x % 2 == 0)                                            // filter() to check condition and retain only even numbers
                .peek(x -> System.out.println("Even: " + x))
                .map(x -> x * x)                                                    // map() to perform some logic and transform each number to its square
                .peek(x -> System.out.println("Squared: " + x))
                .toList()                                                           // collect() to gather the final results as a list
                .stream().peek(x -> System.out.println("Final Output: " + x));


        // -------------------------------Perform stream operation with list of objects ---------------------------------------

        List<TestEmployee> employees = List.of(
                new TestEmployee(1, "Alice", 70000, "HR", 30),
                new TestEmployee(2, "Bob", 80000, "Finance", 35),
                new TestEmployee(3, "Charlie", 90000, "IT", 28),
                new TestEmployee(4, "David", 60000, "Marketing", 40),
                new TestEmployee(5, "Eve", 75000, "IT", 32),
                new TestEmployee(6, "Frank", 85000, "Finance", 29),
                new TestEmployee(7, "Grace", 95000, "HR", 45),
                new TestEmployee(8, "Hannah", 72000, "IT", 27),
                new TestEmployee(9, "Ian", 68000, "Marketing", 38),
                new TestEmployee(10, "Jack", 80000, "Finance", 31)
        );

        // ****** Find average age of employees in each department ******

        Map<String, Double> averageAgeByDepartment = employees.stream()
                .collect(Collectors.groupingBy(TestEmployee::getDepartment, Collectors.averagingInt(TestEmployee::getAge)));

        System.out.println("Average age of employees in each department: " + averageAgeByDepartment);




        // ****** Filter employees with salary greater than 75000 and collect their names ******

        List<String> highEarners = employees.stream()
                .filter(emp -> emp.getSalary() > 75000)
                .map(TestEmployee::getName)
                .toList();

        System.out.println("Employees with salary greater than 75000: " + highEarners);




        // ****** Get employees of IT department and sort them by age ******

        List<TestEmployee> itEmployeesSortedByAge = employees.stream()
                .filter(emp -> emp.getDepartment().equals("IT"))
                .sorted((a, b) -> b.getAge() - a.getAge())
                .toList();

        System.out.println("IT Employees sorted by age: " + itEmployeesSortedByAge);




        // ****** Calculate total salary expenditure ******

        double totalSalary = employees.stream()
                .mapToDouble(TestEmployee::getSalary)
                .sum();

        System.out.println("Total salary expenditure: " + totalSalary);




        // ****** Find the highest paid employee ******

        String highestPaidEmployee = employees.stream()
                .max(Comparator.comparingDouble(TestEmployee::getSalary))
                .map(TestEmployee::getName)
                .orElse(null);

        System.out.println("Highest paid employee: " + highestPaidEmployee);




        // ****** Count number of employees in each department ******

        Map<String, Long> employeeCountByDepartment = employees.stream()
                .collect(Collectors.groupingBy(TestEmployee::getDepartment, Collectors.counting()));

        System.out.println("Number of employees in each department: " + employeeCountByDepartment);




        // ****** Find names of employees older than 30 ******

        List<String> employeesOlderThan30 = employees.stream()
                .filter(emp -> emp.getAge() > 30)
                .map(TestEmployee::getName)
                .toList();

        System.out.println("Employees older than 30: " + employeesOlderThan30);




        // ****** Sort employees by salary in descending order ******

        List<TestEmployee> employeeSalarySortedDesc = employees.stream()
                .sorted((emp1, emp2) -> (int) (emp2.getSalary() - emp1.getSalary()))
                .toList();

        System.out.println("Employees sorted by salary in descending order: " + employeeSalarySortedDesc);




        // ****** Find department wise highest paid employee ******

        Map<String, TestEmployee> departmentWiseHighestPaidEmployee = employees.stream()
                .collect(Collectors.groupingBy(TestEmployee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(TestEmployee::getSalary)),
                                empOpt -> empOpt.orElse(null)
                        )));

        System.out.println("Department wise highest paid employee: " + departmentWiseHighestPaidEmployee);




        // ****** Check if any employee is earning more than 90000 ******

        boolean anyEmployeeEarningMoreThan90000 = employees.stream()
                .anyMatch(emp -> emp.getSalary() > 90000);

        System.out.println("Is any employee earning more than 90000? " + anyEmployeeEarningMoreThan90000);

    }

}
