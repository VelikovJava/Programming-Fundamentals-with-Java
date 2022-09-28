package DataTypesndVariables;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);

        int n = Integer.parseInt(scenner.nextLine());

        int sum = 0;
        for (int i = 1; i <= n; i++){
            int currentNum = Integer.parseInt(scenner.nextLine());
            sum += currentNum;

            if (sum > 255){
                System.out.println("Insufficient capacity!");
                sum = sum - currentNum;

            }
        }
        System.out.println(sum);

    }
}
