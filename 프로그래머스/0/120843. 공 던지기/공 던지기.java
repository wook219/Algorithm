class Solution {
    public int solution(int[] numbers, int k) {
        int idx = k * 2 -2;
        
        if(idx > numbers.length){
            idx = idx % (numbers.length);
        }

        return numbers[idx];
    }
}