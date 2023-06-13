import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        Vector vector = new Vector();
        
        for (int i = 0; i < intStrs.length; i++) {
            String[] arr = intStrs[i].split("");
            String str = "";
            
            int count = s + l;
            for (int j = s; j < count; j++) {
                str += arr[j];
            }
            
            int num = Integer.parseInt(str);
            
            if (num > k) {
                vector.add(num);
            }
        }
        int[] answer = new int[vector.size()];
        
        for (int i = 0 ; i < answer.length; i++) {
            answer[i] = (int)vector.get(i);
        }
        return answer;
    }
}