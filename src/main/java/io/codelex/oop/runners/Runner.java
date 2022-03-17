package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(300, 390),
    INTERMEDIATE(200, 299),
    ADVANCED(90, 199);

    private int minimumTime;
    private int maximumTime;

    Runner(int minimumTime, int maximumTime) {
        this.minimumTime = minimumTime;
        this.maximumTime = maximumTime;
    }

    static Runner getFitnessLevel(int time) {

        if (time >= BEGINNER.minimumTime && time <= BEGINNER.maximumTime) {
            return BEGINNER;
        } else if (time >= INTERMEDIATE.minimumTime && time <= INTERMEDIATE.maximumTime) {
            return INTERMEDIATE;
        } else if (time >= ADVANCED.minimumTime && time <= ADVANCED.maximumTime) {
            return ADVANCED;
        }
        return null;
    }

}
