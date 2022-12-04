class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int mid = total/num;
        //num이 홀수면 total = num*mid
        if(num%2 == 1){
            for(int i = 0; i < num; i++){
                answer[i] = mid - num/2 + i;
            }
        }else{
            //num이 짝수면 total = num*(mid+1/2)
            for(int i = 0; i< num; i++) {
                answer[i] = mid - num/2 + 1 + i;
            }
        }
        
        return answer;
    }
}