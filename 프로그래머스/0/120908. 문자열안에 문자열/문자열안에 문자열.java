class Solution {
    public int solution(String str1, String str2) {
        int answer = str1.contains(str2) ? 1 : 2;

        return answer;
    }
}

/*
String 객체의 메서드 contains.
str1.contains(str2) 메서드는 문자열 str1안에 str2가 포함되어있는지 확인. 반환타입 : boolean
*/
