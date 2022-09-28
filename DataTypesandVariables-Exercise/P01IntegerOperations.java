package DataTypesndVariables;

import java.util.Scanner;

public class P01IntegerOperations {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);

        int firstNum= Integer.parseInt(scenner.nextLine());
        int secondNum= Integer.parseInt(scenner.nextLine());
        int thirdNum = Integer.parseInt(scenner.nextLine());
        int forthNum= Integer.parseInt(scenner.nextLine());

        int result = ((firstNum + secondNum ) / thirdNum) * forthNum;

        System.out.println(result);



    }
}
