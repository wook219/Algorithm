class Solution {
    public int solution(int n) {
        int answer = 0;
        String sn = n+"";
        
        for(int i = 0; i<sn.length(); i++){
            answer += Integer.parseInt(Character.toString(sn.charAt(i)));
        }
        return answer;
    }
}