class Solution {
    public int[] solution(int brown, int yellow) {
        int areaNumber = brown+yellow;
        int[] answer = {0,0};
        for(int i = 3; i<(brown+yellow)/2; i++){
            if(areaNumber%i ==0){
                int n = areaNumber/i;
                if(brown == (n+i)*2-4){
                    if(n>=i){
                        answer[0] = n;
                        answer[1] = i;
                    }else{
                        answer[0] = 1;
                        answer[1] = n;
                    }
                    break;
                }
            }
        }
        return answer;
    }
}