import java.util.*;

class Solution {
    public long solution(int n) {
        Long[] fibonachi = new Long[n+1];
        fibonachi[0] = 0L;
        fibonachi[1] = 1L;
        for(int i = 2; i<=n; i++){
            fibonachi[i] = (fibonachi[i - 1] + fibonachi[i - 2])%1234567;
        }
        long answer = fibonachi[n];
        return answer;
    }
}