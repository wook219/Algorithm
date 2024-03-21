class Solution {
    public int[] solution(int n) {
        int length = 0;
        for(int i= 1; i*i<=n; i++){
            if(i*i==n){
                length++;
            }else if(n%i==0){
                length+=2;
            }
        }
        int[] answer = new int[length];
        int k = 0;
        for(int i= 1; i<=n; i++){
            if(i*i==n||n%i==0){
                answer[k]=i;
                k++;
            }
        }
        return answer;
    }
}