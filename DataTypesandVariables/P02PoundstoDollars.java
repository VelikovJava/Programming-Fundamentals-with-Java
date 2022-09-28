package DataTypesandVariables;

import java.util.Scanner;

public class P02PoundstoDollars {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);

        float pound = Float.parseFloat(scenner.nextLine());

        float dollars = pound * 1.36f;

        System.out.printf("%.3f", dollars);




    }
}
