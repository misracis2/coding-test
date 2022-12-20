import java.util.Arrays;


class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int i = 0;
        while(budget >= d[i]){
            budget = budget - d[i];
            answer++;
            i++;
            if(i > d.length-1){
                break;
            }
        }
        return answer;
    }
}