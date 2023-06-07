class Solution {
    public int solution(int a, int b) {
        int aa = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int bb = 2 * a * b;
        
        return aa > bb ? aa : bb;
    }
}