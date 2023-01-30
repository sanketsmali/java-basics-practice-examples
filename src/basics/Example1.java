package basics;

import java.util.Scanner;

public class Example1 {
    public static void main(String args[]) {


        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        System.out.println("You have entered " + number);

        for (int i = 0; i < number; i++) {
            System.out.print("*" + " ");
        }

        for (int k = 0; k < number-1; k++) {
            System.out.println();
            for (int j = k; j <= number / 2; j++) {
                System.out.print("  ");
            }
            System.out.print("*" + " ");
        }

        for (int i = 0; i < number-1; i++) {
            System.out.print("*" + " ");
        }

    }
}
