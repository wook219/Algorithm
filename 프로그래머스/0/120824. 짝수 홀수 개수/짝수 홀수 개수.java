class Solution {
    public int[] solution(int[] num_list) {
        int oddCnt = 0; //홀수의 개수
        int evenCnt = 0; //짝수의 개수

        for(int i =0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                evenCnt++;
            }else{
                oddCnt++;
            }
        }
        int[] answer = {evenCnt,oddCnt};

        
        return answer;
    }
}