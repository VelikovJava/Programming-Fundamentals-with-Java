package basic;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);

        int number = Integer.parseInt(scenner.nextLine());
        int sumFact = 0;
        int startNumber = number;

        while (number > 0 ){
            int lastdigit = number % 10;
            int fact = 1;
            for (int i = 1; i <= lastdigit; i++){
                fact = fact * i;

            }

            number = number / 10;
        }
        if (sumFact == startNumber){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
