class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);

            answer += my_string.charAt(i)>=97 ? (char)(ch-32) : (char)(ch+32);
        }
        return answer;
    }
}

/*
소문자와 대문자의 아스키코드 차이는 32이다.
*/
