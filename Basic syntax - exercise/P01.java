package basic;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);

        int age = Integer.parseInt(scenner.nextLine());

        if ( age <= 2 ){
            System.out.println("baby");
        } else if (3 <= age && age <= 13 ) {
            System.out.println("child");
        } else if (14 <= age && age <= 19) {
            System.out.println("teenager");
        } else if (20 <= age && age <= 65) {
            System.out.println("adult");
        } else if (age <= 66){
            System.out.println("elder");
        }

    }
}
