package basic;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine(); //"Acer"
        String password = ""; //парола -> "recA"
        //всяка позиция в текста -> последната(дължина - 1) към първата(0)
        for (int position = username.length() - 1; position >= 0; position--) {
            char currentSymbol = username.charAt(position);
            password += currentSymbol;
        }
        //знаем каква ни е паролата

        String enteredPassword = scanner.nextLine();
        int countFailedTry = 0; //брой неуспешни опити за въвеждане на парола
        //повтаряме: въвеждаме някаква парола
        //стоп: enteredPassword == password
        //продължаваме: enteredPassword != password
        while (!enteredPassword.equals(password)) {
            //грешно въведена парола
            countFailedTry++;
            if (countFailedTry == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }

        //вярна парола -> enteredPassword == password
        if (enteredPassword.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
//        Scanner scenner = new Scanner(System.in);
//
//        String usurename = scenner.nextLine();
//        String password = " ";
//
//        for (int posision = usurename.length() - 1; posision >= 0; posision--){
//            char currentSymbol = usurename.charAt(posision);
//            password = password + currentSymbol;
//
//        }
//         String enterPassword = scenner.nextLine();
//        int countFailedTry = 0;
//        while (!enterPassword.equals(password)){
//            countFailedTry++;
//
//
//            if (countFailedTry == 4 ){
//                System.out.printf("User %s blocked!", usurename );
//                break;
//            }
//            System.out.println("Incorrect password. Try again.");
//            }
//        if (enterPassword.equals(password)){
//              System.out.printf("User %s logged in.", usurename);
//        }
//    }
//}
