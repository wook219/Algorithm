class Solution {
    public int[] solution(int money) {
        int iA = 0;  // 아아개수
        int change = 0; // 잔돈
        
        iA = money / 5500;
        change = money % 5500;
            
        int[] answer = {iA,change};
        
        return answer;
    }
}