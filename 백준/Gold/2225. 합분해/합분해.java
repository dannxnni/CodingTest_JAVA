import javax.imageio.ImageTranscoder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static long[][] dp;
    static long MOD = 1000000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        dp = new long[k+1][n+1];

        recur(k, n);

        System.out.println(String.valueOf(dp[k][n]));
    }
    static long recur(int k, int n) {
        // 값이 최소 값이 아니거라 n = 0이면 반환
        if (dp[k][n] > 0)   return dp[k][n];    // 값이 있거나 n이 0이면 반환
        if (n == 0 || k == 1)   return dp[k][n] = 1;

        for (int i = n; i >= 0; i--) {
            dp[k][n] += recur(k-1, i);
            dp[k][n] %= MOD;
        }
        return dp[k][n];
    }
}