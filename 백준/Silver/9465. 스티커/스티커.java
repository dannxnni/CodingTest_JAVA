import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int q = 0; q < t; q++) {   // 테스트 케이스만큼 돌아야 해
            int n = Integer.parseInt(br.readLine());
            int[][] cost = new int[2][n];   // cost : 배열 위치마다 값 저장
            int[][] dp = new int[2][n];     // dp : 최댓값 배열

            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

            for (int i = 0; i < n; i++) {
                cost[0][i] = Integer.parseInt(st1.nextToken());
                cost[1][i] = Integer.parseInt(st2.nextToken());
            }
            dp[0][0] = cost[0][0];
            dp[1][0] = cost[1][0];

            int max = Math.max(dp[0][0], dp[1][0]);

            for (int i = 1; i < n; i++) {
                if (i == 1) {
                    dp[0][i] = dp[1][0] + cost[0][1];
                    dp[1][i] = dp[0][0] + cost[1][1];
                    max = Math.max(dp[0][i], dp[1][i]);
                    continue;
                }
                dp[0][i] = Math.max(dp[1][i-1], dp[1][i-2]) + cost[0][i];
                dp[1][i] = Math.max(dp[0][i-1], dp[0][i-2]) + cost[1][i];
                max = Math.max(max, Math.max(dp[0][i], dp[1][i]));
            }
            sb.append(max + "\n");
        }
        System.out.println(sb);
    }
}