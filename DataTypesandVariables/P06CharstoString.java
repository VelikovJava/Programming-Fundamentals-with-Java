package DataTypesandVariables;

import java.util.Scanner;

public class P06CharstoString {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);

        char firstSymbol = scenner.nextLine().charAt(0);
        char secondSymbol = scenner.nextLine().charAt(0);
        char thirdSymbol = scenner.nextLine().charAt(0);

        String result = String.format("%c%c%c", firstSymbol, secondSymbol, thirdSymbol);

        System.out.println(result);

    }
}
