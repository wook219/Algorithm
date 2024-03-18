class Solution {
    public int[] solution(int n) {
        int[] answer;
        
        answer = (n%2==0) ? new int[n/2] : new int[n/2+1];
        
        for(int i = 0; i<answer.length; i++){
                answer[i] = (2*i)+1;
            }
        
        return answer;
    }
}