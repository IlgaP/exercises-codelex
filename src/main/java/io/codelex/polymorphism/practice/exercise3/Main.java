package io.codelex.polymorphism.practice.exercise3;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", "Brown", "Park street 7", 1234, 9.5);
        student.display();

        Employee employee = new Employee("Anna", "Smith", "Main street 6", 1212, "Manager");
        employee.display();
    }


}
