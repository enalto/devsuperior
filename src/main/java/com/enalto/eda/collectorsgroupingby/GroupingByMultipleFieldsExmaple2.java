package com.enalto.eda.collectorsgroupingby;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByMultipleFieldsExmaple2 {

    public static void main(String[] args) {

        ArrayList<Employee> employeesList = new ArrayList<>();


        employeesList.add(new Employee(101, "Glady", 25_00_000, new GroupBy("Manager", "Male")));

        employeesList.add(new Employee(102, "Vlad", 15_00_000, new GroupBy("Software Engineer", "Female")));
        employeesList.add(new Employee(103, "Shine", 20_00_000, new GroupBy("Lead Engineer", "Female")));
        employeesList.add(new Employee(104, "Nike", 25_00_000, new GroupBy("Manager", "Female")));
        employeesList.add(new Employee(105, "Slagan", 15_00_000, new GroupBy("Software Engineer", "Male")));
        employeesList.add(new Employee(106, "Murekan", 15_00_000, new GroupBy("Software Engineer", "Male")));
        employeesList.add(new Employee(107, "Gagy", 15_00_000, new GroupBy("Software Engineer", "Male")));

        Map<GroupBy, Long> multipleFieldsMap = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getGroupBy, Collectors.counting()));

        System.out.println("Group by designation and gender");

        System.out.println(multipleFieldsMap);

        System.out.println("");
        multipleFieldsMap.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
