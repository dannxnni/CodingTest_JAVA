import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = str.length() / 10;
        int index = 0;

        for (int i = 0; i < n; i++) {   
            System.out.println(str.substring(index, index+10)); // substring : 문자열 자르기
            index += 10;
        }
        n = str.length() % 10;
        System.out.println(str.substring(str.length()-n));
    }
}