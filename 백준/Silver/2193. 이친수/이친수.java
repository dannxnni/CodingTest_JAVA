import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static long[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        dp = new long[N+1];

        System.out.println(recur(N));
    }

    static long recur(int N) {
       if (N == 0)  return 0;
       if (N == 1)  return 1;
       if (dp[N] > 0) return dp[N];

       dp[N] = recur(N-1) + recur(N-2);
        return dp[N];
       }
}