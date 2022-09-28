package DataTypesndVariables;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);

        double maxVolume = Double.MIN_VALUE;
        String maxModelKeg = " ";

        int countKeg = Integer.parseInt(scenner.nextLine());
        for (int keg = 1; keg <= countKeg; keg++){
            String kegModel = scenner.nextLine();
            double radius = Double.parseDouble(scenner.nextLine());
            int height = Integer.parseInt(scenner.nextLine());

            double volume = Math.PI * Math.pow(radius,  2) * height;

            if (volume > maxVolume){
                maxVolume = volume;

                maxModelKeg =  kegModel;
            }

        }
        System.out.println(maxModelKeg);
    }
}
