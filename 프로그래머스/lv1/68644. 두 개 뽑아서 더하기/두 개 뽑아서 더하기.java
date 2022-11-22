import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        int count = numbers.length;
        int[] arr = new int[(count*(count-1))/2];

        int t = 0;
        for(int i = 0; i < count-1; i++) {
            for (int j = i + 1; j < count; j++) {
                arr[t] = numbers[i] + numbers[j];
                t++;
            }
        }

        Arrays.sort(arr);

        int[] temp = new int[(count*(count-1))/2];
        int j = 0;
        for(int i = 0; i < (count*(count-1))/2-1; i++){
            if(arr[i] != arr[i+1]) {
                temp[j] = arr[i];
                j++;
            }
        }
        temp[j] = arr[(count*(count-1))/2-1];

        answer = new int[j+1];
        for(int i = 0; i < j+1; i++){
            answer[i] = temp[i];
        }
        return answer;
    }
}