import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        char[] my_string_arr = my_string.toCharArray();
        int length = 0;
        
        for(int i = 0; i<my_string_arr.length; i++){
            if(my_string_arr[i] > 57){
                my_string_arr[i] = '0';
            }else{
                length++;
            }
        }
        
        int[] answer = new int[length];
        int k = 0;
        
        for(int i = 0; i<my_string_arr.length; i++){
            if(my_string_arr[i]!='0'){
                answer[k] = my_string_arr[i]-'0';
                k++;
            }
        }
        Arrays.sort(answer);
        
        return answer;
    }
}