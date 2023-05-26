import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s;

        while ((s = br.readLine()) != null) {
            int small = 0;      // 소문자
            int capital = 0;    // 대문자
            int num = 0;        // 숫자
            int space = 0;      // 공백

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isLowerCase(c))   small++;
                if (Character.isUpperCase(c))   capital++;
                if (Character.isDigit(c))       num++;
                if (c == ' ')   space++;
            }
            sb.append(small + " " + capital + " " + num + " " + space).append('\n');
        }
        System.out.println(sb);
    }
}