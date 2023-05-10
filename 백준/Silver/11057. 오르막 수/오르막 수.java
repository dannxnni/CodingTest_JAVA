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

        int result = 0;
        for (int i = 0; i < 10; i++) {
            result += recur(N,i);
            result %= MOD;
        }
        System.out.println(result);
    }
    public static long recur(int N, int num) {
        if (dp[N][num] == 0) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j <= i; j++) {
                    dp[N][i] += recur(N - 1, j);
                    dp[N][i] %= MOD;
                }
            }
        }
        return dp[N][num] % MOD;
    }
}