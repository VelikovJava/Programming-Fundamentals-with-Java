package Fundamentals;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        String TypeOfDay = scanner.nextLine(); 
        int age = Integer.parseInt(scanner.nextLine()); 
        
//        if (TypeOfDay.equals("Weekday")){
//            if (age > 0 && age <= 18){
//                System.out.printf("12$");
//            }else if (age <= 64){
//                System.out.printf("18$");
//            } else if (age >64 ) {
//                System.out.printf("12$");
//            }else {
//                System.out.println("Error");
//            }
//        }else if (TypeOfDay.equals("Weekend")){
//            if (age > 0 && age <= 18){
//                System.out.printf("15$");
//            }else if (age <= 64){
//                System.out.printf("20$");
//            } else if (age >64 ) {
//                System.out.printf("15$");
//            }else {
//                System.out.printf("Error");
//            }
//        }else if (TypeOfDay.equals("Holiday")){
//            if (age > 0 && age <= 18){
//                System.out.printf("5$");
//            }else if (age <= 64){
//                System.out.printf("12$");
//            } else if (age >64 ) {
//                System.out.printf("10$");
//            }else {
//                System.out.printf("Error");
//
//            }
//        }
        switch (TypeOfDay){
            case "Weekday":
                if (age > 0 && age <= 18){
                    System.out.printf("12$");
                }else if (age <= 64){
                    System.out.printf("18$");
                } else if (age > 64) {
                    System.out.printf("12$");
                }else {
                    System.out.println("Error");
                }
                break;
            case "Weekend":
                if (age > 0 && age <= 18){
                    System.out.printf("15$");
                }else if (age <= 64){
                    System.out.printf("120$");
                } else if (age > 64) {
                    System.out.printf("15$");
                }else {
                    System.out.println("Error");
                }
                break;
            case "Holiday":
                if (age > 0 && age <= 18){
                    System.out.printf("5$");
                }else if (age <= 64){
                    System.out.printf("12$");
                } else if (age > 64) {
                    System.out.printf("10$");
                }else {
                    System.out.println("Error");
                }
                break;
        }
    }
}
