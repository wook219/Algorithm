class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int x = dot[0];
        int y = dot[1];
        answer = x>0 && y>0 ? 1 : x<0 && y>0 ? 2 : x<0 && y<0 ? 3 : 4;
        return answer;
    }
}