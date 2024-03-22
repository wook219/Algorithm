class Solution {
    public String solution(int age) {
        String answer = "";
        String [] engAge = {"a","b","c","d","e","f","g","h","i","j"};

        
        while(true){
            if(age < 10){
                answer = engAge[age] + answer;
                break;
            }
            answer = engAge[age%10] + answer;
                age /= 10;
        }

        return answer;
    }
}