import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        //짧은변이 sides[0], 긴변이 sides[1]
        //1. sides[1]이 가장 긴 변일때
        for(int i = 0; i<=sides[1]; i++){
            if(i>sides[1]-sides[0]&&i<=sides[1]){
                answer++;
            }
        }
        //2. 나머지 하나의 변이 가장 긴 변일때
        for(int i = 0; i<sides[0]+sides[1]; i++){
            if(i>sides[1]&&i<sides[0]+sides[1]){
                answer++;
            }
        }
        
        return answer;
    }
}