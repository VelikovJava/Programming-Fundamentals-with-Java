package DataTypesandVariables;

import java.util.Scanner;

public class P08LowerorUpper {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);

        char symbol = scenner.nextLine().charAt(0);

//        if (Character.isUpperCase(symbol)){
//            System.out.println("upper-case");
//        }else {
//            System.out.println("lower-case");
//
//       }

        if (symbol >= 'A' && 'Z' >= symbol ){
            System.out.println("upper-case");
        }else {
            System.out.println("lower-case");
        }
    }
}
