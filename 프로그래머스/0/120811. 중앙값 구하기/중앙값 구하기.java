import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int idx = (int)array.length/2;
        
        Arrays.sort(array);
        
        answer = array[idx];
        
        return answer;
    }
}