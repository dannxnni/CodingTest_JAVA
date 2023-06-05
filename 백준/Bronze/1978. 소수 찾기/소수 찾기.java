import javax.imageio.ImageTranscoder;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();  // n
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while (st.hasMoreTokens()) {
            boolean isPrime = true; // 소수 o => true, 소수 x => false
            int num = Integer.parseInt(st.nextToken());

            if (num == 1)   {
                continue;
            }

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0)   {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)    count++;
        }
        System.out.println(count);
    }
}