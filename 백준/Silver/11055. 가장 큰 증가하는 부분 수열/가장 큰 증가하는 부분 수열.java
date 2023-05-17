import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] seq;   // 수열
    static Integer[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        seq = new int [n];
        dp = new Integer [n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = seq[0];
        int max = dp[0];

        for (int i = 1; i < n; i++) {
            dp[i] = seq[i];
            for (int j = i-1; j >= 0; j--) {
                if (seq[i] > seq[j]) {
                    dp[i] = Math.max(dp[i], dp[j]+seq[i]);
                }
            }
            max = Math.max(max, dp[i]);
        }
        System.out.println(String.valueOf(max));
    }
}