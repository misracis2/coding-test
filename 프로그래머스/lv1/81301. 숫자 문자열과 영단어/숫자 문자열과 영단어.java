class Solution {
    public int solution(String s) {
        int answer = 0;
        s = new String(s+" ");
        String[] transtable = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        for(int i = 0; i < 10; i++) {
            if(s.contains(transtable[i])) {
                String[] m = s.split(transtable[i]);
                s = new String("");
                for (int j = 0; j < m.length; j++) {
                    if(j < m.length-1) {
                        s += m[j] + i;
                    }else if(j == m.length-1) {
                        s += m[j];
                    }
                }
            }
        }
        s = s.replace(" ","");
        answer = Integer.parseInt(s);
        return answer;
    }
}