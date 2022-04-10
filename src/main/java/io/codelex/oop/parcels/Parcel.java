package io.codelex.oop.parcels;

public class Parcel implements Validatable {

    public static final int MAX_SUM_OF_DIMENSIONS = 300;
    public static final int MAX_SIZE = 30;
    public static final double MAX_SIZE_NOT_EXPRESS = 30.0;
    public static final double MAX_SIZE_EXPRESS = 15.0;
    private final int xLength;
    private final int yLength;
    private final int zLength;
    private final float weight;
    private final boolean isExpress;

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
        valid = isValidSumOfDimensions(valid);
        valid = isValidEachSize(valid);
        valid = isValidWeightForNotExpress(valid);
        valid = isValidWeightForExpress(valid);
        return valid;
    }

    private boolean isValidWeightForExpress(boolean valid) {
        if (weight > MAX_SIZE_EXPRESS && isExpress) {
            valid = false;
            System.out.println("Weight can not exceed 15.0 for Express!");
        }
        return valid;
    }

    private boolean isValidWeightForNotExpress(boolean valid) {
        if (weight > MAX_SIZE_NOT_EXPRESS && !isExpress) {
            valid = false;
            System.out.println("Weight can not exceed 30.0!");
        }
        return valid;
    }

    private boolean isValidEachSize(boolean valid) {
        if (xLength < MAX_SIZE || yLength < MAX_SIZE || zLength < MAX_SIZE) {
            valid = false;
            System.out.println("Each size can not be less than 30!");
        }
        return valid;
    }

    private boolean isValidSumOfDimensions(boolean valid) {
        if (xLength + yLength + zLength > MAX_SUM_OF_DIMENSIONS) {
            valid = false;
            System.out.println("The sum of dimensions exceed 300!");
        }
        return valid;
    }
}
