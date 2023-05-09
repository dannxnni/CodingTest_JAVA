import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
        int mul = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        String str = String.valueOf(mul);   // int인 mul을 string으로 변환

        for (int i = 0; i < str.length(); i++) {    // arr을 0으로 초기화 했기에 str의 문자를 하나하나 갖고와 대응되는 인덱스 값 증가
            arr[(str.charAt(i) - '0')]++;
        }
        for (int v : arr) {
            System.out.println(v);
        }
    }
}