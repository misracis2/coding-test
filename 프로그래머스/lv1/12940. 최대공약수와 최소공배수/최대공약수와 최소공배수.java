class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        int gcd = 1;
        int i = 2;
        long k = n*m;
        while(i<=Math.min(n,m)){
            if(n%i == 0 && m%i == 0){
                gcd *= i;
                n = n/i;
                m = m/i;
                i = 2;
            }else{
                i++;
            }
        }
        answer = new int[]{gcd, (int) (k/gcd)};
        return answer;
    }
}