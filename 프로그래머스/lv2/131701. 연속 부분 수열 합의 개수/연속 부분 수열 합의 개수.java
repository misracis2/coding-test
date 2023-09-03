import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int answer = 0;
        //i는 부분수열의 길이
        for(int i = 1; i <= elements.length; i++){
            for (int j = 0; j < elements.length; j++) {
                int sum = 0;
                for (int k = 0; k < i; k++) {
                    if (j + k >= elements.length) {
                        sum += elements[j + k - elements.length];
                    }else {
                        sum += elements[j+k];
                    }
                }
                set.add(sum);
            }
        }
        answer = set.size();
        return answer;
    }
}