class Solution {
    public String solution(String my_string) {
        String answer = my_string.replaceAll("[^a-z &&[^aeiou]]", "");

        return answer;
    }
}