package DataTypesandVariables;

import java.util.Scanner;

public class P12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);

        Scanner scanner = new Scanner(System.in);
        int kolkko = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int currentNum = 0;
        boolean specialNum = false;
        for (int i = 1; i <= kolkko; i++) {
            currentNum = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            specialNum = (sum == 5) || (sum == 7) || (sum == 11);
            System.out.printf("%d -> %b%n", currentNum, specialNum);
            sum = 0;
            i = currentNum;
        }
    }
}
