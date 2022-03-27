package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {

    private final double commissionRate;
    private double totalSalesMade;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }

    public void addSales(double totalSales) {
        totalSalesMade += totalSales;
    }

    public double pay() {
        double payment = super.pay() + totalSalesMade * commissionRate;
        totalSalesMade = 0;
        return payment;
    }

    public String toString() {
        String result = super.toString();
        result += "\nTotal sales: " + totalSalesMade;
        return result;
    }


}
