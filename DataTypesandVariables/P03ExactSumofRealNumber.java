package DataTypesandVariables;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class P03ExactSumofRealNumber {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);

        int n = Integer.parseInt(scenner.nextLine());
        BigDecimal sum = new BigDecimal(BigInteger.valueOf(0));

        for (int i = 1; i <= n; i++){
          BigDecimal currentNum = new BigDecimal(scenner.nextLine());

          sum = sum.add(currentNum);

        }
        System.out.println(sum);

    }
}
