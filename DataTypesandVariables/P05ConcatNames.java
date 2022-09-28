package DataTypesandVariables;

import java.util.Scanner;

public class P05ConcatNames {
    public static void main(String[] args) {
       Scanner scenner = new Scanner(System.in);

       String firstSymbol = scenner.nextLine();
       String secondSymbol = scenner.nextLine();
       String thirdSymbol = scenner.nextLine();

       String result = String.format("%s%s%s", firstSymbol, thirdSymbol, secondSymbol);

        System.out.println(result);

    }
}
