import java.util.ArrayList;
import java.util.List;

class Solution {
    List<String> cache;
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        cache = new ArrayList<>();
        if(cacheSize==0){
            return cities.length *5;
        }
        for (int i = 0; i < cities.length; i++) {
            answer += isInCache(cities[i], cacheSize);
        }
        return answer;
    }

    private int isInCache(String city, int cacheSize) {
        for (int i = 0; i < cache.size(); i++) {
            if (cache.get(i).equalsIgnoreCase(city)) {
                if (i == 0) {
                    cache.set(0,city);
                    return 1;
                }
                if(cache.size()>= cacheSize){
                    for (int j = i; j > 0; j--) {
                        cache.set(j, cache.get(j - 1));
                    }
                    cache.set(0,city);
                    return 1;
                }
                cache.add(0, city);
                return 1;
            }
        }
        if(cache.size()>=cacheSize){
            cache.remove(cache.size()-1);
            cache.add(0,city);
            return 5;
        }
        cache.add(0,city);
        return 5;
    }
}