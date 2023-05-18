import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;   // 배열
    static Integer[] dp;    // 메모이제이션 할 dp
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        dp = new Integer[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = arr[0]; // dp[0]은 첫 원소로 이전에 탐색할 게 없기 때문에 arr[0]으로 초기화
        max = arr[0];

        recur(n-1); // dp의 마지막 index는 n-1이므로 n-1부터 탐색

        System.out.println(max);
    }

    static int recur(int n) {
        if (dp[n] == null) {
            dp[n] = Math.max(recur(n-1) + arr[n], arr[n]);

            max = Math.max(dp[n], max); // 해당 dp[n]과 max 중 큰 값으로 max 갱신
        }
        return dp[n];
    }
}