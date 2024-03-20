class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for(int i = 0; i<s1.length; i++){
            for(int k = 0; k<s2.length; k++){
                answer += s2[k].equals(s1[i]) ? 1 : 0;
            }
        }
        
        return answer;
    }
}