import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        Vector <Integer> vector = new Vector<>();
        
        while (i < arr.length) {
            if (vector.size() == 0) {
                vector.add(arr[i]);
                i++;
            }
            else if (vector.get(vector.size() - 1) < arr[i]) {
                vector.add(arr[i]);
                i++;
            }
            else if (vector.get(vector.size() - 1) >= arr[i]) {
                vector.remove(vector.size() - 1);
            }
        }
        
        int[] answer = new int[vector.size()];
        for (int j = 0; j < vector.size(); j++) {
            answer[j] = vector.get(j);
        }
        return answer;
    }
}