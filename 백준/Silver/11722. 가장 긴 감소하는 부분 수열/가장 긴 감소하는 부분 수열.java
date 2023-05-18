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

        int result = 0;

        for (int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;

            for (int j = i-1; j >= 0; j--) {
                if (seq[i] < seq[j] && dp[i] <= dp[j]) {
                    dp[i] = dp[j] + 1;
                }
            }
            result = Math.max(result, dp[i]);
        }
        System.out.println(result);
    }
}