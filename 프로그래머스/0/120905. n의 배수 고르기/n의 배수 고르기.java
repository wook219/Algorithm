import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int resultLength = 0;
        for(int i = 0; i<numlist.length; i++){
            if(numlist[i]%n!=0){
                numlist[i]=0;
            }else{
                resultLength++;
            }
        }
        
        int[] result = new int[resultLength];
        int k = 0;

        for(int i = 0; i<numlist.length; i++){
             if(numlist[i]!=0){
                 result[k]=numlist[i];
                 k++;
             }
        }
        
        return result;
    }
}