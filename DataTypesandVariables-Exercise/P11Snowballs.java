package DataTypesndVariables;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);

        int countBalls = Integer.parseInt(scenner.nextLine());
        double maxSnowballsValue = Double.MIN_VALUE;
        int maxSnowBallsnow = 0;
        int maxSnowQuanity = 0;
        int maxSnowTime = 0;

        for (int balls = 1; balls <= countBalls; balls++){
            int snowBallSnow = Integer.parseInt(scenner.nextLine());
            int snowBallTime = Integer.parseInt(scenner.nextLine());
            int snowBallQuality = Integer.parseInt(scenner.nextLine());

            double snowballsValue = Math.pow(snowBallSnow / snowBallTime, snowBallQuality);

            if (maxSnowballsValue < snowballsValue ){
                maxSnowballsValue = snowballsValue;
                maxSnowBallsnow = snowBallSnow;
                maxSnowQuanity = snowBallQuality;
                maxSnowTime = snowBallTime;
            }
        }
        System.out.printf("%d : %d = %.02f (%d)", maxSnowBallsnow, maxSnowTime, maxSnowballsValue, maxSnowQuanity);
    }
}
