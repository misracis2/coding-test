class Solution {
    public int solution(int[] arr) {
        int gcd = 0;
        int answer = 1;
        int lcm = arr[0];
        for(int i =1; i<arr.length; i++){
            int maxNum = Math.max(lcm, arr[i]);
            int minNum = Math.min(lcm, arr[i]);
            while (minNum != 0) {
                int r = maxNum % minNum; // 나머지를 구해준다.

                // GCD(a, b) = GCD(b, r)이므로 변환한다.
                maxNum = minNum;
                minNum = r;
            }
            gcd = maxNum;
            lcm = lcm * arr[i] / gcd;
        }
        
        return lcm;
    }
}