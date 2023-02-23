class Solution {
    public int[] solution(String s) {
        int[] answer = {0,0};
        while(true) {
            answer[0] ++;
            String newS = s.replaceAll("0", "");
            answer[1] += s.length() - newS.length();
            s = Integer.toBinaryString(newS.length());
            if (s.equals("1")) {
                break;
            }
        }
        return answer;
    }
}