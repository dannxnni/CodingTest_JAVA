import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        Vector vector = new Vector();
        for (int i = l; i <= r; i++) {
            String s = String.valueOf(i);   // 반복문에서 얻은 i 값을 문자열로 변환
            String[] str =s.split("");
            
            int count = 0;
            for (int j = 0; j < str.length; j++) {
                if (str[j].equals("0") || str[j].equals("5")) {
                    count++;    // 원소가 0, 5인 경우 count++
                }
            }
            if (count == str.length) {  // 둘이 같은 경우 모든 값이 0 or 5로 이루어져있는 것
                vector.add(i);
            }
        }
        
        int [] answer = new int [vector.size()];
        if (vector.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        }
        else {
            for (int i = 0; i < answer.length; i++) {
                answer[i] = (int)vector.get(i);
            }
        }
        return answer;
    }
}