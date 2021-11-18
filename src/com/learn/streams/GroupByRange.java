package com.learn.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByRange {

    enum SalaryRange {
        RANGE_1,
        RANGE_2,
        RANGE_3,
        RANGE_4;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("a",20,100));
        employees.add(new Employee("b",21,200));
        employees.add(new Employee("c",35,300));
        employees.add(new Employee("d",32,400));
        employees.add(new Employee("e",35,150));
        employees.add(new Employee("f",19,250));
        employees.add(new Employee("g",21,350));


        Function<Employee, SalaryRange> empGroups = e -> {
            if (e.getSalary() >= 100 && e.getSalary() < 200) {
                return SalaryRange.RANGE_1;
            } else if (e.getSalary() >= 200 && e.getSalary() < 300) {
                return SalaryRange.RANGE_2;
            } else if (e.getSalary() >= 300 && e.getSalary() < 400) {
                return SalaryRange.RANGE_3;
            } else if (e.getSalary() >= 400) {
                return SalaryRange.RANGE_4;
            }
            return null;
        };

        Map<SalaryRange, Long> empSalaryRangeGroups = employees.stream().collect(Collectors.groupingBy(empGroups, Collectors.counting()));

        Arrays.asList(SalaryRange.values()).forEach(range -> System.out.println(range + ": " + empSalaryRangeGroups.get(range)));

    }


}
