package DataTypesandVariables;

import java.util.Scanner;

public class P04TownInfo {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);

        String cityName = scenner.nextLine();
        int populations = Integer.parseInt(scenner.nextLine());
        short area = Short.parseShort(scenner.nextLine());

        String full = String.format("Town %s has population of %d and area %d square km.", cityName, populations, area );

        System.out.printf(full);

    }
}
