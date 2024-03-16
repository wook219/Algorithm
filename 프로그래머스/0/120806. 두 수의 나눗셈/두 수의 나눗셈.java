class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
       
        double division = (double)num1 / num2 * 1000;
        answer = (int)Math.floor(division);
        
        return answer;
//         floor : Math객체의 소수점 버리는 메서드
    }
}

/*

class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        return num1 * 1000 / num2;
    }
}

이런 풀이도.. 있음.. 현타
*/
