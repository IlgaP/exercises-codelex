package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str;
        str = input.next().toLowerCase();

        PhoneKeyPad a = new PhoneKeyPad();
        System.out.println("1)");
        a.phoneKeyPadSwitch(str);
        System.out.println();
        System.out.println("2)");
        a.phoneKeyPadIf(str);

    }

    private void phoneKeyPadIf(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'b' || str.charAt(i) == 'c') {
                System.out.print(2);
            } else if (str.charAt(i) == 'd' || str.charAt(i) == 'e' || str.charAt(i) == 'f') {
                System.out.print(3);
            } else if (str.charAt(i) == 'g' || str.charAt(i) == 'h' || str.charAt(i) == 'i') {
                System.out.print(4);
            } else if (str.charAt(i) == 'j' || str.charAt(i) == 'k' || str.charAt(i) == 'l') {
                System.out.print(5);
            } else if (str.charAt(i) == 'm' || str.charAt(i) == 'n' || str.charAt(i) == 'o') {
                System.out.print(6);
            } else if (str.charAt(i) == 'p' || str.charAt(i) == 'q' || str.charAt(i) == 'r' || str.charAt(i) == 's') {
                System.out.print(7);
            } else if (str.charAt(i) == 't' || str.charAt(i) == 'u' || str.charAt(i) == 'v') {
                System.out.print(8);
            } else if (str.charAt(i) == 'w' || str.charAt(i) == 'x' || str.charAt(i) == 'y' || str.charAt(i) == 'z') {
                System.out.print(8);
            }
        }
    }

    private void phoneKeyPadSwitch(String str) {
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a', 'b', 'c' -> System.out.print(2);
                case 'd', 'e', 'f' -> System.out.print(3);
                case 'g', 'h', 'i' -> System.out.print(4);
                case 'j', 'k', 'l' -> System.out.print(5);
                case 'm', 'n', 'o' -> System.out.print(6);
                case 'p', 'q', 'r', 's' -> System.out.print(7);
                case 't', 'u', 'v' -> System.out.print(8);
                case 'w', 'x', 'y', 'z' -> System.out.print(9);
            }
        }
    }
}
