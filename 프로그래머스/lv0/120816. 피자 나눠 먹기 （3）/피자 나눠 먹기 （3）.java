class Solution {
    public int solution(int slice, int n) {
            double temp = (double)n/slice;
            int answer = (int)Math.ceil(temp);
            return answer;
        }
}