package io.codelex.arithmetic.exercises;

public class CozaLozaWozaExercise6 {
    public static void main(String[] args) {
        int i = 1;
        while (i < 110) {
            boolean clw = false;
            if (i % 3 == 0) {
                clw = true;
                System.out.print("Coza");
            }
            if (i % 5 == 0) {
                clw = true;
                System.out.print("Loza");
            }
            if (i % 7 == 0) {
                clw = true;
                System.out.print("Woza");
            }
            if (!clw) {
                System.out.print(i);
            }
            System.out.print(" ");
            if (i % 11 == 0) {
                System.out.println();
            }
            i++;
        }
    }
}
