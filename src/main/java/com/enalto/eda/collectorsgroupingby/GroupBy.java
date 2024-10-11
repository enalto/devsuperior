package com.enalto.eda.collectorsgroupingby;

import java.util.Objects;

public class GroupBy {
    private String designation;
    private String gender;

    public GroupBy(String designation, String gender) {
        this.designation = designation;
        this.gender = gender;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "GroupBy{" +
                "designation='" + designation + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupBy groupBy = (GroupBy) o;
        return Objects.equals(designation, groupBy.designation) && Objects.equals(gender, groupBy.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(designation, gender);
    }
}
