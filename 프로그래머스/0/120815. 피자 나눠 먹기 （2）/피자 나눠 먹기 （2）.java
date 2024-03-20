class Solution {
    public int solution(int n) {
        int answer = getHowManyPizza(n,6);
        
        return answer;
    }
    
    
    public int getHowManyPizza(int n, int pieceCnt){
        int max = 0;
        //최대공약수
        for(int i =1; i<=n && i<=pieceCnt; i++){
            if(n%i==0&&pieceCnt%i==0)
                max = i;
        }
        
        //최소공배수 / 6
        int pizzaCnt = (n*pieceCnt) / max / 6;
        
        return pizzaCnt;
    }
}