package io.codelex.loops.practice;

public class AsciiFigure {
    public static void main(String[] args) {

        for(int i = 0; i <5; i++ ){
            int stars = i * 8;
            for(int j = 0; j <32; j++){
                int simbolsLeft = (32 - stars) / 2;
                if(j < simbolsLeft){
                    System.out.print("/");
                } else if(j > (simbolsLeft+stars)-1){
                    System.out.print("\\");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();

        }
    }
}
