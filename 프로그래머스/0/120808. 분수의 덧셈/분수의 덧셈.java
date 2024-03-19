class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1*denom2 + numer2*denom1;
        int denom = denom1 * denom2;
        int max = 1;
        for(int i = 1; i<=numer&&i<=denom; i++){
            if(numer%i==0 && denom%i == 0){
                max = i;
            }
        }
        numer = numer/max;
        denom = denom/max;
        
        int[] answer = {numer,denom};

        
        return answer;
    }
}
/*
1. 두 분수의 합을 나타내는 식으로, numer과 denom이라는 새로운 변수에 분자와 분모를 대입
2. 반복문으로 조건에 맞는 최대공약수를 찾음. -key point-
3. 배열에 numer과 denom 할당
*/