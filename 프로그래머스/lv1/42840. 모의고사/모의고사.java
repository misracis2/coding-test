class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] correct = {0,0,0};
        //수포자 삼인방 맞힌 문제 수 구하기
        int[] ans1 = {1, 2, 3, 4, 5};
        for(int i = 0; i < (answers.length); i++) {
            if(ans1[i%5] == answers[i]) {
                correct[0]++;
            }
        }
        int[] ans2 = {2, 1, 2, 3, 2, 4, 2, 5};
        for(int i = 0; i < (answers.length); i++) {
            if(ans2[i%8] == answers[i]) {
                correct[1]++;
            }
        }
        int[] ans3 = {3,3,1,1,2,2,4,4,5,5};
        for(int i = 0; i < (answers.length); i++) {
            if(ans3[i%10] == answers[i]) {
                correct[2]++;
            }
        }
        //가장 많이 맞힌 점수 찾기
        int max = 0;
        for(int i = 0; i < 3; i++) {
            if(correct[i] > max) {
                max = correct[i];
            }
        }
        //최고 득점자 찾기
        int count = 0;
        int[] temp ={0,0,0};
        for(int i = 0; i < 3; i++) {
            if(correct[i] == max) {
                temp[i] = i+1;
                count++;
            }
        }
        //answer 배열 만들기
        answer = new int[count];
        int n = 0;
        for(int i = 0; i < 3; i++) {
            if(temp[i] != 0) {
                answer[n] = temp[i];
                n++;
                if(n == count) {
                    break;
                }
            }
        }
        return answer;
    }
}