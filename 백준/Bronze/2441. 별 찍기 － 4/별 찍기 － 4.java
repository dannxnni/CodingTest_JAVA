import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {   // i : 행
            for (int j = n-i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}