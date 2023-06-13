import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer;
        
        for (int i = 0; i < intStrs.length; i++) {
            int tmp = Integer.parseInt(intStrs[i].substring(s, s + l));
            if (tmp > k)    list.add(tmp);
        }
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}