import javax.imageio.ImageTranscoder;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    static boolean[] prime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        prime = new boolean[n+1];
        get_prime();

        for (int i = m; i <= n; i++) {
            if (!prime[i]) System.out.println(i);
        }
    }

    static void get_prime() {
        // true => 소수 X, false => 소수 o
        prime[0] = prime[1] = true; // 0,1 => 소수 x

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i])   continue;
            for (int j = i*i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}