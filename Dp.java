import java.util.Scanner;

public class Dp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        int[] dp = new int[11];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i < 11; i++) {
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }

        for (int j = 1; j <= T; j++) {
            int n = scanner.nextInt();
            System.out.println(dp[n]);
        }
    }
}

