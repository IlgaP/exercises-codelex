package io.codelex.oop.parcels;

public class ParcelTest {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(30, 35, 40, 25, false);
        System.out.println(parcel.validate());
    }
}
