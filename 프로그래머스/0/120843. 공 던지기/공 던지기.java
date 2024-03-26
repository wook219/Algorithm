class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int idx = k * 2 -2;
        if(idx > numbers.length){
            idx = idx % (numbers.length);
        }
        answer = numbers[idx];
        return answer;
    }
}