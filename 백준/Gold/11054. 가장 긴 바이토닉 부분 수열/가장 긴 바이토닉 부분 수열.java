import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] seq;   // 수열
    static Integer[] r_dp;
    static Integer[] l_dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        seq = new int [n];
        r_dp = new Integer [n];
        l_dp = new Integer [n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            LIS(i);
            LDS(i);
        }

        int max = -1;
        for (int i = 0; i < n; i++) {
            max = Math.max(r_dp[i] + l_dp[i], max);
        }
        System.out.println(max-1);
    }
    static int LIS(int n) {
        if (r_dp[n] == null) {  // 탐색하지 않은 위치의 경우
            r_dp[n] = 1;

            // n 이전의 노드 탐색
            for (int i = n-1; i >= 0; i--) {
                if (seq[i] < seq[n]) {  // 이전 노드 중 seq[n]의 값보다 작은 걸 발견했알 때
                    r_dp[n] = Math.max(r_dp[n], LIS(i)+1);
                }
            }
        }
        return r_dp[n];
    }

    static int LDS(int n) {
        if (l_dp[n] == null) {  // 탐색하지 않은 위치의 경우
            l_dp[n] = 1;

            // n 이후의 노드 탐색
            for (int i = n+1; i < l_dp.length; i++) {
                if (seq[i] < seq[n]) {  // 이후 노드 중 seq[n]의 값보다 작은 걸 발견했을 때
                    l_dp[n] = Math.max(l_dp[n], LDS(i)+1);
                }
            }
        }
        return l_dp[n];
    }
}