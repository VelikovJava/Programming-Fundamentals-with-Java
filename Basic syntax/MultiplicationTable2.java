package Fundamentals;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int theInteger = Integer.parseInt(scanner.nextLine());

        while (theInteger <= 10){
            int product = theInteger * n;

            System.out.printf("%d X %d = %d%n",n ,theInteger, product);
            theInteger++;
        }
    }
}
