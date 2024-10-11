package com.enalto.eda.collectorsgroupingby;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByMultipleFieldsExmaple1 {

    public static void main(String[] args) {

        ArrayList<Employee> employeesList = new ArrayList<>();

        employeesList.add(new Employee(101, "Glady", "Manager", "Male", 25_00_000));
        employeesList.add(new Employee(102, "Vlad", "Software Engineer", "Female", 15_00_000));
        employeesList.add(new Employee(103, "Shine", "Lead Engineer", "Female", 20_00_000));
        employeesList.add(new Employee(104, "Nike", "Manager", "Female", 25_00_000));
        employeesList.add(new Employee(105, "Slagan", "Software Engineer", "Male", 15_00_000));
        employeesList.add(new Employee(106, "Murekan", "Software Engineer", "Male", 15_00_000));
        employeesList.add(new Employee(107, "Gagy", "Software Engineer", "Male", 15_00_000));

        Map<String, Map<String, Long>> multipleFieldsMap = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getDesignation,
                        Collectors.groupingBy(Employee::getGender, Collectors.counting())));

        System.out.println("Group by designation and gender");
        //System.out.println(multipleFieldsMap);
        multipleFieldsMap.forEach((key, value) -> System.out.println(key + " " + value));

        Map<String, Map<String, List<Employee>>> multipleFieldsMapList = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getDesignation,
                        Collectors.groupingBy(Employee::getGender, Collectors.toList())));

        System.out.println("Group by designation and gender");
        System.out.println(multipleFieldsMapList);

        System.out.println("");
        multipleFieldsMapList.forEach((key, value) -> System.out.println(key + " " + value));

    }
}
