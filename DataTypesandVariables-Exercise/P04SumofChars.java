package DataTypesndVariables;

import java.util.Scanner;

public class P04SumofChars {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);

        int countSymbol = Integer.parseInt(scenner.nextLine());
        int sum = 0;

        for (int symbol  = 1; symbol <= countSymbol; symbol++) {
            char value = scenner.nextLine().charAt(0);
            int code = (int) value;
            sum+= code;

        }
        System.out.printf("The sum equals: %d", sum);
    }
}
