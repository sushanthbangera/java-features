package com.learn.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeAddress {

    public static void main(String[] args) {

        Address ad1 = new Address(1, "Bangalore");
        Address ad2 = new Address(2, "Pune");
        Address ad3 = new Address(3, "Hyderabad");
        Address ad4 = new Address(4, "Gurgoan");

        Employee e1 = new Employee(1, "Sush", 1000, ad1);
        Employee e2 = new Employee(2, "Souru", 5000, ad1);
        Employee e3 = new Employee(3, "Ashu", 6000, ad1);
        Employee e4 = new Employee(4, "Achi", 10000, ad1);

        Employee e5 = new Employee(5, "Sush2", 3000, ad2);
        Employee e6 = new Employee(6, "Souru2", 5000, ad2);


        Employee e7 = new Employee(7, "Asu", 6000, ad3);
        Employee e8 = new Employee(8, "Achu", 10000, ad3);

        Employee e9 = new Employee(9, "Ram", 6000, ad4);
        Employee e10 = new Employee(10, "Sham", 10000, ad4);

        List<Employee> employeeList = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
        List<Address> addressList = Arrays.asList(ad1, ad2, ad3, ad4);

        Map<String, Long> countMap = employeeList.stream()
                .filter(e -> e.getSalary() > 1000)
                .collect(Collectors.groupingBy(e -> e.getAddressId().getCity(), Collectors.counting()));

        //System.out.println(countMap);

        Map<String, Employee> empMap = employeeList.stream().collect(Collectors.toMap(Employee::getName, Function.identity()));

        System.out.println(empMap);

    }
}
