class Solution {
    public int solution(int n, int k) {
        // n은 양꼬치 인분수(12,000), k는 음료수 개수(2,000)
        int answer = 0;
        answer = n*12000+k*2000;
        for(int i = 1; i<=n; i++){
            if(i%10==0)
                answer-=2000;
        }
        return answer;
    }
}
