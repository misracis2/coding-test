class Solution {
    public int solution(int n) {
        int answer = n;
        int oneNumber = Integer.bitCount(n);
        while(true){
            answer++;
            int newOneNumber = Integer.bitCount(answer);
            if(oneNumber == newOneNumber){
                break;
            }
        }
        return answer;
    }
}