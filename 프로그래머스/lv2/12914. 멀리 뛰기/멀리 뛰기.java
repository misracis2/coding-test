class Solution {
    public long solution(int n) {
        if (n <= 3) {
            return n;
        }
        long[] fibonacci = new long[n];
        fibonacci[0] = 1L;
        fibonacci[1] = 2L;
        fibonacci[2] = 3L;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = (fibonacci[i - 1] + fibonacci[i - 2]) %1234567;
        }
        return fibonacci[n-1];
    }

}