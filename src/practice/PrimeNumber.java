package practice;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {
            int input = scn.nextInt();

            int count = 0;
            for (int j = 1; j <= input; j++) {
                if (input % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println("Number is Prime");
            } else {
                System.out.println("Not Prime");
            }

        }
    }
}
