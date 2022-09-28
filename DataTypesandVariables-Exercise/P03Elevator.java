package DataTypesndVariables;

import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);

        int peoples = Integer.parseInt(scenner.nextLine());
        int maxpeoples = Integer.parseInt(scenner.nextLine());

        int courses = (int) Math.ceil((double) peoples / maxpeoples);

        System.out.println(courses);
    }
}
