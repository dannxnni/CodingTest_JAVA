import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] num = new int[4];
        num[0] = a;
        num[1] = b;
        num[2] = c;
        num[3] = d;
        Arrays.sort(num);
        
        int mul = 1;
         
        int[] dice = new int[6];
        for(int i = 0; i < 4; i++){
            dice[num[i]-1]++;
        }
        
        for(int i = 0; i < 6; i++){
            if(dice[i] == 4){
                answer = 1111 * (i + 1);
                break;
            }
            else if(dice[i] == 3){
                for(int j = 0; j < 6; j++){
                    if(dice[j] == 1){
                        answer = (10 * (i + 1) + (j + 1)) * (10 * (i + 1) + (j + 1));
                        break;
                    }
                }
            }
            else if(dice[i] == 2){
               for(int j = 0; j < 6; j++){
                    if(dice[j] == 2){
                        if(i ==j ){
                            continue;
                        }
                        else{
                            answer=(i + 1 + j + 1) * ((i + 1) - (j +1));
                            break;
                        }
                        
                    }
                   else if(dice[j] == 1){
                        mul = mul * (j + 1);
                   }
                }
                if(mul != 1){
                    answer = mul;
                }
            }
            if(num[0] != num[1] && num[1] != num[2] && num[2] != num[3]){
                answer = num[0];
            }
                
        }
        
        return answer;
    }
}