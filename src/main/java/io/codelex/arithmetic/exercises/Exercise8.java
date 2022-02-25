package io.codelex.arithmetic.exercises;

public class Exercise8 {
    final static double minimumWage = 8.0;
    final static int maxHours = 60;

    public static void main(String[] args) {
        float bp;
        int hw;

        bp = 7.5F;
        hw = 35;
        salaryCalculator(bp, hw);

        bp = 8.2F;
        hw = 47;
        salaryCalculator(bp, hw);

        bp = 10.0F;
        hw = 73;
        salaryCalculator(bp, hw);
    }

    public static void salaryCalculator(double basePay, int hoursWorked){
        double salary;
        if((basePay < minimumWage) || (hoursWorked > maxHours)){
            System.out.println("Error");
        } else {
            if(hoursWorked > 40){
                salary = (basePay * 40) + (basePay * 1.5 *(hoursWorked - 40));
            } else {
                salary = basePay * hoursWorked;
            }
            System.out.println("Salary is: "+salary);
        }

    }
}
