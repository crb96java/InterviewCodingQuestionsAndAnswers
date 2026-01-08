package com.main;

import com.pojo.Employee;

import java.util.*;

public class InterviewCodingQuestionsAndAnswersOnList {

    public static void main(String []args){

        //List of Employee Object details
        List<Employee> listOfEmployeeDetails = new ArrayList< Employee >();
        listOfEmployeeDetails.add(new Employee(10, "Ramesh", 30, 400000));
        listOfEmployeeDetails.add(new Employee(20, "John", 29, 350000));
        listOfEmployeeDetails.add(new Employee(30, "Tom", 30, 450000));
        listOfEmployeeDetails.add(new Employee(40, "Pramod", 29, 500000));
        listOfEmployeeDetails.add(new Employee(45, "Jani", 33, 470000));
        listOfEmployeeDetails.add(new Employee(67, "Manasa", 28, 200000));
        listOfEmployeeDetails.add(new Employee(41, "Anand", 33, 930000));
        listOfEmployeeDetails.add(new Employee(23, "Hari", 31, 670000));
        listOfEmployeeDetails.add(new Employee(22, "Juli", 28, 200000));

        //Print the latest 3rd height salary Employee details
        Optional<Employee> thirdHeightEmpDetails =  listOfEmployeeDetails.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).findFirst();
        System.out.println("Print the latest 3rd height salary Employee details");
        System.out.println(thirdHeightEmpDetails);
        System.out.println();

        //Print the List of Employee details in ascending order based on salary
        List<Employee> employeeDetails= listOfEmployeeDetails.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
        System.out.println("Sort the Employee details based on descending orders");
        System.out.println(employeeDetails);

        //Print the duplicate String values from the List
        List<String> listOfStringsValues = Arrays.asList("AA","AB","AD","AA","AC","AB","CA");
        Set<String> setOfStringValues = new HashSet<>();
        List<String> duplicateStringValues = listOfStringsValues.stream().filter(name->!setOfStringValues.add(name)).toList();
        System.out.println("Print the duplicate String values from the List");
        System.out.println(duplicateStringValues);

        //Remove the duplicate values from the list of strings
        List<String> removeDuplicateValues = listOfStringsValues.stream().distinct().toList();
        System.out.println("Remove the duplicate values from the list of strings");
        System.out.println(removeDuplicateValues);

        //How to get the latest 5 records from the Employee details based on salary
        List<Employee>  latestFiveRecords = listOfEmployeeDetails.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(5).toList();
        System.out.println("Display the latest five records from the Employee list based on Salary");
        System.out.println(latestFiveRecords);

    }
}
