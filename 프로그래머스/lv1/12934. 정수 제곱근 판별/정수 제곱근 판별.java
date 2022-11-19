class Solution {
    public long solution(long n) {
        long answer = 0;
        long sqrt = (long)(Math.sqrt(n));
        for(long i = 0; i <= sqrt; i++){
            if(n == (i*i)) {
                answer = ((i+1)*(i+1));
                break;
            }else {
                answer = -1;
            }
        }
        return answer;
    }
}