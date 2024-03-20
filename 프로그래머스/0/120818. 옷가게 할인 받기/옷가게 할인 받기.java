class Solution {
    public int solution(int price) {
        int answer = discount(price);
        
        return answer;
    }
    
    
    public int discount(int price){
        double discountPer = 0;
        discountPer = price >= 500000 ? 0.8: price>= 300000 ? 0.9 : price>=100000 ? 0.95 : 1;
        
        return (int)(price * discountPer);
    }
}