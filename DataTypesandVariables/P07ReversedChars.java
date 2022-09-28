package DataTypesandVariables;

import java.util.Scanner;

public class P07ReversedChars {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);

        char firsSymbol = scenner.nextLine().charAt(0);
        char secondSymbol = scenner.nextLine().charAt(0);
        char thirdSymbol = scenner.nextLine().charAt(0);

        System.out.printf("%c %c %c", thirdSymbol, secondSymbol, firsSymbol);

    }
}
