import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();

        // 초기화
        for (int i = 0; i < n; i++) {
            queue.add(i+1);
        }

        sb.append("<");
        while (queue.size() > 1) {
            for (int i = 0; i < k-1; i++) {
                queue.add(queue.poll());    // poll : 첫번째 값 반환 후 제거
            }
            sb.append(queue.poll() + ", ");
        }
        sb.append(queue.poll() + ">");
        System.out.println(sb);
    }
}