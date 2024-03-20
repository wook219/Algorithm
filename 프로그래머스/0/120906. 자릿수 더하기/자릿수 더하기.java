class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n>0){
            answer += n%10;
            n/=10;
        }
        
        return answer;
    }
}

/*
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
*/