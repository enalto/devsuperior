package com.enalto.eda.collectorsgroupingby;

public class Employee {
    private int id;
    private String name;
    private String designation;
    private String gender;
    private long salary;
    private GroupBy groupBy;

    public Employee(int id, String name, String designation, String gender, long salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.gender = gender;
        this.salary = salary;
    }

    public Employee(int id, String name, long salary, GroupBy groupBy) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.groupBy = groupBy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setGroupBy(GroupBy groupBy) {
        this.groupBy = groupBy;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public GroupBy getGroupBy() {
        return groupBy;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", groupBy=" + groupBy +
                '}';
    }
}
