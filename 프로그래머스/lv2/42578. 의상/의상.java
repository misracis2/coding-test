import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> clothesMap = countClothesPerType(clothes);

        int answer = 1;
        for (String s : clothesMap.keySet()) {
            answer *= (clothesMap.get(s)+1);
        }

        return answer-1;
    }

    Map<String, Integer> countClothesPerType(String[][] clothes) {
        Map<String, Integer> clothesMap = new HashMap<>();
        for (String[] oneClothes : clothes) {
            if (clothesMap.containsKey(oneClothes[1])) {
                clothesMap.put(oneClothes[1], clothesMap.get(oneClothes[1]) + 1);
                continue;
            }
            clothesMap.put(oneClothes[1], 1);
        }
        return clothesMap;
    }
}