import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];
            long sum = 0;   // 최대값이 10^10이므로 long

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    sum += gcd(arr[i], arr[j]);
                }
            }
            System.out.println(sum);
        }
    }
    // 최대공약수
    static int gcd (int a,int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}