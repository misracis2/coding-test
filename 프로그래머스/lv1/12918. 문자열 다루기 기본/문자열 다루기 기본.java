class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() !=4 && s.length() !=6){
            answer =false;
        }
        int cnt = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)>47 && s.charAt(i)<58){
                cnt++;
            }
        }
        if(s.length() != cnt){
            answer = false;
        }
        return answer;
    }
}