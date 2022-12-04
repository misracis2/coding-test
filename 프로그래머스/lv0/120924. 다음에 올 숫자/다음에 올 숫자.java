class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int i = 0;
        
            if((common[i+1] - common[i]) == (common[i+2] - common[i+1])) {
                answer = common[common.length - 1] + (common[i+1] - common[i]); 
            }else{
                answer = common[common.length -1]*(common[i+1]/common[i]);
            }
        
        return answer;
    }
}