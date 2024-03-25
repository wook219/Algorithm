class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        int idx = 1;
        int divide = 100000;
        //1. num에 k가 포함되어 있을 때
        while(divide>0){
            if(num<divide){
                divide = divide / 10;
                continue;
            }
            answer = num / divide;

            if(answer == k){
                break;
            }
                num = num % divide;
            idx++;
            if(divide==1){
                idx=-1;
            }
        }
        return idx;
    }
}