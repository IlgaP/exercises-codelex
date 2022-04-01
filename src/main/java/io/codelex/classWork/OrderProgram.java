package io.codelex.classWork;

public class OrderProgram {
    public static void main(String[] args) {

        FoodItem milk = new FoodItem("Milk", 0.75, "30.03.22");
        ElectronicsItem radio = new ElectronicsItem("Radio", 25.00, 100);
        HouseholdItem bucket = new HouseholdItem("Bucket", 5.00, "red");

        Oder order1 = new Oder();
        order1.addItem(milk);
        order1.addItem(radio);
        order1.addItem(bucket);

        try {
            CheckIfOrderNotEmpty(order1);
        } catch (WrongOrderException e) {
            System.out.println(e);
        } finally {
            Invoice invoice1 = new Invoice(order1, "INV123");
            System.out.println(invoice1.showInvoice());
        }

    }

    static void CheckIfOrderNotEmpty(Oder oder) throws WrongOrderException {
        if (oder.getSize() == 0) {
            throw new WrongOrderException();
        }
    }

    public static class WrongOrderException extends Exception {
        public WrongOrderException() {
            super("The order is empty!");
        }
    }

    public static class BadFoodException extends Exception {
        public BadFoodException() {
            super("Bad food!");
        }
    }
}
