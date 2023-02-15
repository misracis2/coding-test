class Solution {
    public String solution(int[] food) {
        String answer = "";
        String answer1 = "";
        for(int i = 1; i< food.length; i++){
            if(food[i] >= 2){
                int n = food[i]/2;
                String s = String.valueOf(i);
                answer = answer + s.repeat(n);
                answer1 = s.repeat(n) + answer1;
            }
        }
        answer = answer + "0" + answer1;
        return answer;
    }
}