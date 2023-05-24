import javax.imageio.ImageTranscoder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.StubNotFoundException;
import java.util.*;
import java.util.jar.Attributes;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap <Long, Integer> cards = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        int max = 0;
        long x = 0;

        for (int i = 0; i < n; i++) {
            long card = Long.parseLong(br.readLine());
            
            // getOrDefault (key, defaultValue) : 찾는 key가 존재하면 해당 key에 매핑 된 값 반환, 그렇지 않으면 디폴트 값이 반환
            cards.put(card, cards.getOrDefault(card, 0) + 1);
            
            if (cards.get(card) > max) {
                max = cards.get(card);
                x = card;
            } else if (cards.get(card) == max) {
                x = Math.min(x, card);
            }
        }
        System.out.println(x);
    }
}