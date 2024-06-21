package com.linkedlist;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee_Grouping {
	
	    public static void main(String[] args) {

	        // Create a list of Employee objects
	        List<Employee> employees = Arrays.asList(
	                new Employee(1, 10, "Chandra"),
	                new Employee(2, 20, "Rajesh"),
	                new Employee(3, 30, "Rahul"),
	                new Employee(4, 20, "Ramana")
	        );

	        // Group employees by department using Collectors.groupingBy
	        Map<Integer, List<Employee>> byDept = employees.stream()
	                .collect(Collectors.groupingBy(Employee::getDepartment));

	        // Print the results
	        byDept.forEach((deptId, empList) -> 
	            System.out.println("DeptId: " + deptId + "   "+ empList.stream()
	                    .map(Employee::getName)
//	                    .sorted(Comparator.comparing(Employee::getDepartment))

	                    .collect(Collectors.joining(", "))));
//	            System.out.println(empNames);
	        
	    
	}

}
