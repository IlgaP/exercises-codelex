package io.codelex.oop.parcels;

public class Parcel implements Validatable {

    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        boolean valid = true;
        if (xLength + yLength + zLength > 300) {
            valid = false;
            System.out.println("The sum of dimensions exceed 300!");
        }
        if (xLength < 30 || yLength < 30 || zLength < 30) {
            valid = false;
            System.out.println("Each size can not be less than 30!");
        }
        if (weight > 30.0 && !isExpress) {
            valid = false;
            System.out.println("Weight can not exceed 30.0!");
        }
        if (weight > 15.0 && isExpress) {
            valid = false;
            System.out.println("Weight can not exceed 15.0 for Express!");
        }
        return valid;
    }
}
