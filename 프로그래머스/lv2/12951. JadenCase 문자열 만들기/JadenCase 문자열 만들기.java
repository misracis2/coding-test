class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        s = s.toLowerCase();
        String[] word = s.split(" ");
        for(int i=0; i<word.length; i ++){
            if(word[i].isEmpty()){
                answer.append(" ");
                continue;
            }
            answer.append(word[i].substring(0, 1).toUpperCase());
            if(word[i].length() > 1) {
                answer.append(word[i].substring(1));
            }
            if(i != word.length - 1){
                answer.append(" ");
            }
        }
        if(s.length() > answer.length()){
                answer.append(" ".repeat(s.length() - answer.length()));
            }
        return answer.toString();
    }
}