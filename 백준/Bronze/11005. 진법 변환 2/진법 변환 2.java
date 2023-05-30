import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        while (N != 0) {
            if (N % B >= 10)    sb.append((char)((N % B) + 55));    // 나머지 값이 10 이상이면 +55 (아스키코드에서 대문자 65 ~ 90)
            else sb.append(N % B);  // 10미만이라면 그대로 출력
            N /= B;
        }
        System.out.println(sb.reverse().toString());
    }
}