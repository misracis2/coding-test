class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        if(money < price*((long)count*(1+count))/2){
            answer = (price*((long) count *(1+count))/2)-money;
        }
        return answer;
    }
}