import javax.imageio.ImageTranscoder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.jar.Attributes;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];    // [a][0] => x좌표 & [a][1] => y좌표

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][0] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (e1, e2) -> {
            if(e1[0] == e2[0]) {    // 첫번째 원소가 같다면 두번째 원소끼리 비교
                return e1[1] - e2[1];
            }
            else {  // 그렇지 않다면 첫번째 원소끼리 비교
                return e1[0] - e2[0];
            }
        });

        for (int i = 0; i < n; i++) {
            sb.append(arr[i][1] + " " + arr[i][0]).append('\n');
        }
        System.out.println(sb);
    }
}