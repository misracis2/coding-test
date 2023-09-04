import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            String[] stringArr = s.split("");    
            Stack<String> stack = new Stack<>();
            for (int j = 0; j < stringArr.length; j++) {
                if (stack.isEmpty() || !isValidString(stack.peek() + stringArr[j])) {
                    stack.push(stringArr[j]);
                } else {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                answer++;
            }
            s = s.substring(1) + s.charAt(0);
        }

        return answer;
    }

    private boolean isValidString(String string) {
        List<String > stringArr = Arrays.asList("[]", "{}", "()");
        return stringArr.contains(string);
    }
}