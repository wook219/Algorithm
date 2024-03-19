class Solution {
    public int solution(int n, int t) {
        int answer = n * (int)Math.pow(2,t);
        return answer;
    }
}

/*
Math.pow(곱할 수, 제곱 수)는 거듭제곱을 해주는 메서드이며 반환타입이 double이다.
따라서 int로 형변환.
*/