package basics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn. nextInt();

        for(int i=0;i<n;i++)
        {
            int number = scn.nextInt();
            int count=0;

            for(int j=2; j * j <= number;j++)
            {
                if(number%j==0)
                {
                    count++;
                }
            }
            if(count==0)
            {
                System.out.println("Number is Prime");
            }
            else {
                System.out.println("Number is not Prime");
            }

        }
    }
}
