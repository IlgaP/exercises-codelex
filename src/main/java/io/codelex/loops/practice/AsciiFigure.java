package io.codelex.loops.practice;

import java.util.Scanner;

public class AsciiFigure {
    public static void main(String[] args) {

        int lines;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of figure: ");
        lines = input.nextInt();
        drawFigure(lines);
    }
    // ja lines=1 ???  ->  ////\\\\ vai ********

    public static void drawFigure(int lines){
        for(int i = 0; i <lines; i++ ){
            int stars = i * 8;
            for(int j = 0; j <(lines-1)*8; j++){
                int simbolsLeft = ( (lines-1)*8- stars) / 2;
                if(j < simbolsLeft){
                    System.out.print("/");
                } else if(j > (simbolsLeft+stars)-1){
                    System.out.print("\\");
                } else {
                    System.out.print
                            ("*");
                }
            }
            System.out.println();
        }
    }
}
