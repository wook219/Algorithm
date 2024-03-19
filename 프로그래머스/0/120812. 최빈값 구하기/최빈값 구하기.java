import java.util.*;

class Solution {
    public static int solution(int[] array) {
        Arrays.sort(array);
        int answer =0;
        int max = array[array.length-1];
        
        int[] array2 = new int[max+1];
        for(int i = 0; i<array.length; i++){
            array2[array[i]]++;
        }
        max = array2[0];
        
        for(int i = 1; i<array2.length; i++){
            if(max<array2[i]){
                max = array2[i];
                answer = i;
            }else if(max==array2[i]){
                answer = -1;
            }
        }
        
        return answer;
    }
    public static void main(String[] args) {
		int[] array = {1,1,2,2};
		
		System.out.println(solution(array));
	}
}