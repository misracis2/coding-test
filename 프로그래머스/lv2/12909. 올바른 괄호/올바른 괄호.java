class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.substring(i,i+1).equals("(")){
                count++;
            }else {
                count--;
            }
            if(count<0){
                answer = false;
            }
        }
        if(count!=0){
            answer = false;
        }
        return answer;
    }
}