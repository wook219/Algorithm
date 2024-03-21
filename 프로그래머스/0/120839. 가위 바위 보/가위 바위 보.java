class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        for(int i = 0; i<rsp.length(); i++){
            char ch = rsp.charAt(i);
            answer += ch =='2' ? 0 : ch =='0' ? 5 : 2;
        }
        
        return answer;
    }
}