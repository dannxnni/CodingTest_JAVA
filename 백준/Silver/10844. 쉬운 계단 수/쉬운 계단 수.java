import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static Long[][] dp;
    static int N;
    final static long MOD = 1000000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        dp = new Long[N + 1][10];

        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1L;
        }

        long result = 0;

        for (int i = 1; i <= 9; i++) {
            result += recur (N,i);
        }
        System.out.println(result % MOD);
    }

    // digit : 자릿수 (길이), val : 자릿값
    static long recur(int digit, int val) {

        if (digit == 1) {   // 첫째 자릿수에 도착하면 더 이상 탐색할 필요 X
            return dp[digit][val];
        }
        // 해당 자릿수의 val 값에 대해 탐색 X 경우
        if (dp[digit][val] == null) {
            // val = 0일 경우 그 다음은 1만 올 수 O
            if (val == 0) {
                dp[digit][val] = recur(digit-1, 1); // digit-1인 이유는 해당 자릿값 다음에 위치할 숫자이기 때문에
            }
            // val = 9일 경우 그 다음은 8만 올 수 O
            else if (val == 9) {
                dp[digit][val] = recur(digit-1, 8);
            }
            else {
                dp[digit][val] = recur(digit-1, val-1) + recur(digit-1, val+1);
            }
        }
        return dp[digit][val] % MOD;
    }
}