import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    final static int MOD = 10007;
    static long[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        dp = new long[N + 1][10];

        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }
        for (int i = 2; i < N+1; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k <= j; k++) {
                    dp[i][j] = (dp[i][j] + dp[i-1][k] % MOD);
                }
            }
        }
        int answer = 0;
        for (int i = 0; i < 10; i++) {
            answer += dp[N][i];
        }
        System.out.println(answer%MOD);
    }
}