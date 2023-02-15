class Solution {
        public int solution(int a, int b, int n) {
        int answer = 0;
        int newCoke = 0;
        while (a<=n){
            newCoke = n / a * b;
            answer += newCoke;
            n = n % a + newCoke;
        }
        return answer;
    }
}