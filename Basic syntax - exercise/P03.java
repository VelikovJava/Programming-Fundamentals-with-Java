package basic;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);

        int students = Integer.parseInt(scenner.nextLine());
        String type = scenner.nextLine();
        String day = scenner.nextLine();

        double price = 1;

        if (type.equals("Students")) {
            if (day.equals("Friday")) {
                price = students * 8.45;
            }
            if (day.equals("Saturday")) {
                price = students * 9.80;
            }
            if (day.equals("Sunday")) {
                price = students * 10.46;
            }

        } else if (type.equals("Business")) {
            if (day.equals("Friday")) {
                price = students * 10.90;
            }
            if (day.equals("Saturday")) {
                price = students * 15.60;
            }
            if (day.equals("Sunday")) {
                price = students * 16.00;
            }
        } else if (type.equals("Regular")) {
            if (day.equals("Friday")) {
                price = students * 10.00;
            }
            if (day.equals("Saturday")) {
                if (students >10 && students <20)
                    price = students * 95;
                else {
                    price = students * 20.00;
                }
            }
            if (day.equals("Sunday")) {
                price = students * 22.50;
            }
        }
        System.out.printf("Total price: %.2f", price);
    }
}
