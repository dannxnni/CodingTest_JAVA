import javax.imageio.ImageTranscoder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.jar.Attributes;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder[] p = new StringBuilder[201];
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        // 객체 배열의 인덱스에 각 StringBuilder 객체 생성
        for (int i = 0; i < p.length; i++) {
            p[i] = new StringBuilder();
        }

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            // 카운팅 정렬 : 나이를 인덱스로하여 해당 배열에 나이, 이름을 append
            p[age].append(age).append(' ').append(name).append('\n');
        }

        for (StringBuilder val : p) {
            sb.append(val);
        }
        System.out.println(sb);
    }
}