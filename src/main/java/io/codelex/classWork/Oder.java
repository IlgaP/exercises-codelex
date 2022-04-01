package io.codelex.classWork;

import java.util.ArrayList;
import java.util.List;

public class Oder {

    static List<Item> itemList = new ArrayList<>();
    static int size = 0;

    public Oder() {
    }

    public static String showOrder() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < itemList.size(); i++) {
            if (i == itemList.size() - 1) {
                result.append(i + 1).append(". ").append(itemList.get(i).toString());
                size++;
                break;
            }
            result.append(i + 1).append(". ").append(itemList.get(i).toString()).append("\n");
            size++;
        }
        return result.toString();
    }

    public int getSize() {
        return size;
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public double getSum() {
        double sum = 0;
        for (Item item : itemList) {
            sum += item.getPrice();
        }
        return sum;
    }

    public double getVAT() {
        return getSum() * 0.21;
    }

    public double getTotal() {
        return getSum() + getVAT();
    }
}
