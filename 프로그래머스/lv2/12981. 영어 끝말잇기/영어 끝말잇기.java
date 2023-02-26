import java.util.HashSet;
import java.util.Set;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        Set<String> duplication = new HashSet<>();
        if(words[0].length() == 1){
            answer[0] = 1;
            answer[1] = 1;
            return answer;
        }else {
            duplication.add(words[0]);
        }
        for(int i = 1; i< words.length; i++){
            if(words[i].length() == 1){
                if((i+1)%n==0){
                    answer[0] = n;
                    answer[1] = (i+1) / n;
                }else{
                    answer[0] = (i + 1) % n;
                    answer[1] = (i+1) / n + 1;
                }
                return answer;
            }else{
                if(duplication.contains(words[i]) || !words[i-1].endsWith(words[i].substring(0,1))){
                    if((i+1)%n==0){
                        answer[0] = n;
                        answer[1] = (i+1) / n;
                    }else{
                        answer[0] = (i + 1) % n;
                        answer[1] = (i+1) / n + 1;
                    }
                    return answer;
                }else{
                    duplication.add(words[i]);
                }
            }
        }
        return answer;
    }
}