package DataTypesndVariables;

import java.util.Scanner;

public class P02SumDigits {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);


        int number = Integer.parseInt(scenner.nextLine());
        int sum = 0;

        while (number > 0) {
            int lastdigit = number % 10;
            sum = sum + lastdigit;
            number = number / 10;

        }
        System.out.println(sum);
    }
}
