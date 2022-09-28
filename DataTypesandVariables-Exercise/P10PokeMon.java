package DataTypesndVariables;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);

        int power =Integer.parseInt(scenner.nextLine());
        int distance = Integer.parseInt(scenner.nextLine());
        int factor = Integer.parseInt(scenner.nextLine());

        int startPower = power;
        int counterPoke = 0;
        while (power >= distance){
            power -= distance;
            counterPoke++;

            if (power == startPower / 2){
                if (factor !=0){

                }
                power = power / factor;

            }
        }
        System.out.println(power);
        System.out.println(counterPoke);
    }
}
