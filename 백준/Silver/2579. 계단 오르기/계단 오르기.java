import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static Integer[] dp;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        dp = new Integer [N+1];
        arr = new int [N+1];

        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = arr[0]; // 디폴트 값이 null이므로 0으로 초기화
        dp[1] = arr[1];

        if (N >= 2) {   // n에 1이 입력될 수도 있기에 예외 처리
            dp[2] = arr[1] + arr[2];
        }
        System.out.println(find(N));
    }

    static int find (int N) {
        // 아직 탐색하지 않은 N번째 계단일 경우
        if (dp[N] == null) {
            dp[N] = Math.max(find(N - 2), find(N - 3) + arr[N - 1]) + arr[N];
        }
        return dp[N];
    }
}