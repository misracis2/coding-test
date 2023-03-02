import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> tangerineSize = new HashMap<>();
       
            for (int j : tangerine) {
                tangerineSize.put(j, tangerineSize.getOrDefault(j, 0) + 1);
                if (tangerineSize.get(j) > k) {
                    return 1;
                }
            }
        
        List<Integer> list = new ArrayList<>();
        for (Integer x : tangerineSize.keySet()) {
            list.add(tangerineSize.get(x));
        }
        list.sort(Collections.reverseOrder());
        for(Integer x : list){
            answer++;
            k -= x;
            if(k <= 0){
                break;
            }
        }
        return answer;
    }
}