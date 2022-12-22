import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i<commands.length; i++) {
            int a = commands[i][0];
            int b = commands[i][1];
            int[] arrayTemp = new int[b - a + 1];
            for(int j = a-1; j<b; j++){
                arrayTemp[j-(a-1)] = array[j];
            }
            Arrays.sort(arrayTemp);
            answer[i] = arrayTemp[commands[i][2]-1];
            System.out.println(answer[i]);

        }
        return answer;
    }
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        Solution s = new Solution();
        s.solution(array, commands);

    }
}
