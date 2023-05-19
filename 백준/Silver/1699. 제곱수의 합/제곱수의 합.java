import javax.imageio.ImageTranscoder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static final int max_input = 100001;
    static int[] memo;    // 메모이제이션 할 dp

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        memo = new int[n + 1];

        // 제곱수들 1로 초기화
        for (int i = 1; i <= (int)Math.sqrt(n); i++) {
            memo[i*i] = 1;
        }
        System.out.println(dp(n));
    }
    static int dp(int n) {
        if (memo[n] == 0) {
            memo[n] = max_input;
            for (int i = (int)Math.sqrt(n); i >= 0; i--) {
                int pow = (int)Math.pow(i,2);
                memo[n] = Math.min(dp(n-pow)+1, memo[n]);
            }
        }
        return memo[n];
    }
}