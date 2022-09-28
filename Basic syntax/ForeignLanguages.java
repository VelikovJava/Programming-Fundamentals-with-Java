package Fundamentals;

import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String country = scanner.next();

//        switch (country){
//            case "Spain":
//                System.out.println("Spanish");
//                break;
//            case "Mexico":
//                System.out.println("Spanish");
//                break;
//            case "Argentina":
//                System.out.println("Spanish");
//                break;
//            case "USA":
//                System.out.println("English");
//                break;
//            case "England":
//                System.out.println("English");
//                break;
//            default:
//                System.out.println("unknow");
//                }
        if (country.equals("USA")) {
            System.out.println("English");
        } else if (country.equals("England")) {
            System.out.println("English");
        } else if (country.equals("Spain")) {
            System.out.println("Spanish");
        }else if (country.equals("Mexico")) {
            System.out.println("Spanish");
        } else if (country.equals("Argentina")) {
            System.out.println("Spanish");
        }else {
            System.out.println("unknow");
        }
    }
}
