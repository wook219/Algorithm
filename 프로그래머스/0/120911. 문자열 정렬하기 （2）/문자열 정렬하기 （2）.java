import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        
        char[] lower = my_string.toCharArray();
        Arrays.sort(lower);
        
        for(char str : lower){
            answer += str;
        }
        
        return answer;
    }
}