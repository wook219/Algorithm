class Solution {
    public String solution(String my_string) {
        String answer = my_string.replaceAll("[^a-z &&[^aeiou]]", "");

        return answer;
    }
}
/*
정규표현식을 이용하여 소문자만 허용, aeiou를 제외.
*/
