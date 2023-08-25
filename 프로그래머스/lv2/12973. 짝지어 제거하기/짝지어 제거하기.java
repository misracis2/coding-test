import java.util.Stack;

class Solution
{
    public int solution(String s) {
        Stack<String> stack = new Stack<>();
        String[] sArr = s.split("");
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty() || !stack.peek().equals(sArr[i])) {
                stack.push(sArr[i]);


            } else{
                stack.pop();
            }
        }
        return stack.size()==0? 1 : 0 ;
    }
}
