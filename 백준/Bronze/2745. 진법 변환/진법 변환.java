import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String N = st.nextToken();
        StringBuilder sb = new StringBuilder(N);
        N = sb.reverse().toString();

        int B = Integer.parseInt(st.nextToken());
        int n;
        int sum = 0;

        for (int i = 0; i < N.length(); i++) {
            if (N.charAt(i) >= 'A' && N.charAt(i) <= 'Z') {
                n = N.charAt(i) - 55;   // 대문자면 -55
            }
            else {  // 숫자면 -'0'
                n = N.charAt(i) - '0';
            }
            sum += (n * Math.pow(B, i));    // 빼준 수에 B의 제곱수를 곱해쥼
        }
        System.out.println(sum);
    }
}