package io.codelex.oop.persons;

import java.time.LocalDate;

public class PersonTest {
    public static void main(String[] args) {

        Employee employee = new Employee("John", "Brown", "JB123", 33, "Accountant", LocalDate.of(2020, 1, 1));
        System.out.println(employee.getInfo());

        Customer customer = new Customer("Peter", "Brown", "PB123", 35, "CID1234", 10);
        System.out.println(customer.getInfo());
    }
}
