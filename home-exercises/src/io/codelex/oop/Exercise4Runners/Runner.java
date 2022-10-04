package io.codelex.oop.Exercise4Runners;

public enum Runner {
    BEGINNER(30, 39),
    MEDIUM(20, 29),
    ADVANCED(10, 19);
    int min;
    int max;

    Runner(int min, int max) {
    }

    public static Runner getFitnessLevel(int time) {
        Runner level;
        if (time >= 10 && time <= 39) {
            if (time < 20) {
                level = ADVANCED;
                return level;
            } else if (time > 20 && time < 29) {
                level = MEDIUM;
                return level;
            } else level = BEGINNER;
            return level;
        } else throw new RuntimeException("You didn't meet any requirements! ");
    }

    public static void main(String[] args) {
        System.out.println(getFitnessLevel(15));
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}
