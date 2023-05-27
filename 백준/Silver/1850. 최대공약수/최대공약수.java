import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long d = gcd(a, b);

        // 1의 개수끼리 gcd를 구한 수가 그 수의 gcd에 들어 있는 1의 개수
        for (int i = 0; i < d; i++) {
            sb.append("1");
        }
        System.out.println(sb);
    }
    // 최대공약수
    static long gcd (long a, long b) {
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}