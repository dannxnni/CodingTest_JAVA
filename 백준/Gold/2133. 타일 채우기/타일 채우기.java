import javax.imageio.ImageTranscoder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static long[] memo;    // 메모이제이션 할 dp

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        memo = new long[31];

        if (n % 2 == 0) {
            dp(n);
        }
        else
        {
            memo[n] = 0;    // 홀수인 경우는 채우는 방법 X
        }
        System.out.println(String.valueOf(memo[n]));
    }

    static long dp (int n) {
        //  기저상태 : 3x0일 때 1
        if (n == 0) memo[0] = 1;

        // 이미 값이 있는 경우
        if (memo[n] > 0)    return memo[n];

        // 마지막 2칸을 추가로 채우는 경우로 초기화
        memo[n] = dp(n-2) * 3;

        for (int i = n-4; i >= 0; i-=2) {   // 4, 6, 8,,, 채우는 경우
            memo[n] += dp(i)*2;
        }
        return memo[n];
    }
}