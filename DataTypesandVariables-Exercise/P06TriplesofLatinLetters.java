package DataTypesndVariables;

import java.util.Scanner;

public class P06TriplesofLatinLetters {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);

        int n = Integer.parseInt(scenner.nextLine());

        for (char i = 'a'; i < 'a' + n; i++)

            for (char k = 'a'; k < 'a' + n; k++)

                for (char l = 'a'; l < 'a' + n; l++)

                {
                    System.out.printf("%c%c%c%n",i , k, l);

            }

    }
}
