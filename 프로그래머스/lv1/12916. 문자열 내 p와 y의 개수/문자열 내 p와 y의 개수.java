class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countP = 0;
        int countY = 0;
        char[] arr = new char[s.length()];
        for(int i = 0; i < arr.length; i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                countP++;
            }
            if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                countY++;
            }
        }
        if(countP != countY){
            answer = false;
        }
        return answer;
    }
}