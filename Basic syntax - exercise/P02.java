package basic;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);

        int num = Integer.parseInt(scenner.nextLine());

        if (num % 10 == 0){
            System.out.printf ("The number is divisible by 10 ");
        } else if (num % 7 == 0 ) {
            System.out.printf ("The number is divisible by 7 ");
        }else if (num % 6 == 0 ) {
            System.out.printf("The number is divisible by 6 ");
        }else if (num % 3 == 0 ) {
            System.out.printf("The number is divisible by 3 ");
        }else if (num % 2 == 0 ) {
            System.out.printf("The number is divisible by 2 ");
        }else {
            System.out.println("Not divisible");
        }

    }
}
