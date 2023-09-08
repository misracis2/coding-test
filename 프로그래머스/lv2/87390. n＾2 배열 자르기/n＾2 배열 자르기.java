class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left) + 1];
        for (int i = 0; i < answer.length; i++) {
            int rowIndexValue = (int)(left / n +1);
            int columnIndexValue = (int)(left % n +1);
            answer[i] = Math.max(rowIndexValue, columnIndexValue);
            left++;
        }

        return answer;
    }
}