class Solution {
    public String solution(int age) {
        String reverse = "";
        String [] engAge = {"a","b","c","d","e","f","g","h","i","j"};

        
        while(true){
            if(age < 10){
                reverse += engAge[age];
                break;
            }
            reverse += engAge[age%10];
                age /= 10;
        }

        String answer = "";
        
        for(int i = reverse.length()-1; i>=0; i--){
            answer += reverse.charAt(i);
        }
        
        return answer;
    }
}