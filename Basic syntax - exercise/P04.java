package basic;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scenner.nextLine());
        int endNumber = Integer.parseInt(scenner.nextLine());
        int sum = 0;

        for (int number = startNumber; number <= endNumber; number++){
            System.out.print(number + " ");
            sum += number;
        }
        System.out.println();
        System.out.printf("Sum: %d", + sum);
    }
}
