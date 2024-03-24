class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int tmpR = numbers[numbers.length-1];
        int tmpL = numbers[0];        
        for(int i = 1; i<numbers.length; i++){
            if(direction.equals("right")){
                answer[0] = tmpR;
                answer[i]=numbers[i-1];
            }else if(direction.equals("left")){
                answer[numbers.length-1] = tmpL;
                answer[i-1] = numbers[i];
            }
        }
        return answer;
    }
}