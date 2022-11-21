import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] chars = new char[s.length()];
        for(int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        Arrays.sort(chars);
        
        for(int i = 0; i < s.length(); i++) {
            answer += chars[s.length()-1-i];
        }
        return answer;
    }
}