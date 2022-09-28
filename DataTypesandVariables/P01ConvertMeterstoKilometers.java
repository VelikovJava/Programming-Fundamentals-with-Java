package DataTypesandVariables;

import java.util.Scanner;

public class P01ConvertMeterstoKilometers {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);

        short meters = Short.parseShort(scenner.nextLine());

        double km = meters / 1000.0;

        System.out.printf("%.2f", km) ;


    }
}
