package DataTypesndVariables;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);

        int source  = Integer.parseInt(scenner.nextLine());

        int days = 0;
        int totalAmountSpice = 0;

        while (source >= 100){
            int spices = source - 26;
            totalAmountSpice += spices;

            days++;
            source -= 10;
        }
        System.out.println(days);
        if (totalAmountSpice >= 26){
            totalAmountSpice -= 26;
        }
        System.out.println(totalAmountSpice);


        }

    }
