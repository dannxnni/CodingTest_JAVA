import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        String[] sub = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            sub[i] = s.substring(i, s.length());
        }

        Arrays.sort(sub);
        for (String str : sub) {
            sb.append(str).append('\n');
        }
        System.out.println(sb);
    }
}