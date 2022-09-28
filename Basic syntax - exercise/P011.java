package basic;

import java.util.Scanner;

public class P011 {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);

        int lossGames = Integer.parseInt(scenner.nextLine());
        double headSetPrice = Double.parseDouble(scenner.nextLine());
        double mousePrice = Double.parseDouble(scenner.nextLine());
        double keyboardPrice = Double.parseDouble(scenner.nextLine());
        double displayPrice = Double.parseDouble(scenner.nextLine());

        int countHeadSet = lossGames / 2;
        int countMouse = lossGames / 3;
        int countKeyboard = lossGames / 6;
        int countdisplayPrice = lossGames / 12;

        double Sum = (headSetPrice * countHeadSet)
                + (mousePrice * countMouse)
                + (countKeyboard * keyboardPrice)
                + (displayPrice * countdisplayPrice);

        System.out.printf("Rage expenses: %.2f lv", Sum);



    }
}
