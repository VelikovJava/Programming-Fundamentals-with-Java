package DataTypesndVariables;

import java.util.Scanner;

public class P05PrintPartoftheASCIITable {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);

        int n = Integer.parseInt(scenner.nextLine());
        int endCount = Integer.parseInt(scenner.nextLine());

        for (int i = n; i <= endCount; i++){
            System.out.print((char) i + " ");

        }
    }
}
