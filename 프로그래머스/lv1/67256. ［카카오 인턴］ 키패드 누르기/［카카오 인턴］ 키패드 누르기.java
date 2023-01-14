import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {

        String answer = "";
        int[] leftLocation = {3, 0};
        int[] rightLocation = {3, 2};
        HashSet<Integer> leftNumbers = new HashSet<>(){
            {
                add(1);
                add(4);
                add(7);
            }
        };
        HashSet<Integer> rightNumbers = new HashSet<>(){
            {
                add(3);
                add(6);
                add(9);
            }
        };
        HashSet<Integer> middleNumbers = new HashSet<>(){
            {
                add(2);
                add(5);
                add(8);
                add(0);
            }
        };
        for(int i = 0; i<numbers.length; i++){
            if(leftNumbers.contains(numbers[i])){
                answer += "L";
                leftLocation[0] = numbers[i] / 3;
                leftLocation[1] = 0;
            } else if (rightNumbers.contains(numbers[i])) {
                answer += "R";
                rightLocation[0] = numbers[i] / 3 -1;
                rightLocation[1] = 2;
            } else {
                if(numbers[i]==0){
                    numbers[i]= 11;
                }
                int leftDistance = Math.abs(leftLocation[0] - numbers[i]/3) + Math.abs(leftLocation[1] - 1);
                int rightDistance = Math.abs(rightLocation[0] - numbers[i]/3) + Math.abs(rightLocation[1] - 1);
                if(leftDistance > rightDistance){
                    answer += "R";
                    rightLocation[0] = numbers[i] / 3;
                    rightLocation[1] = 1;
                } else if (leftDistance < rightDistance) {
                    answer += "L";
                    leftLocation[0] = numbers[i] / 3;
                    leftLocation[1] = 1;
                } else {
                    if(hand.equals("right")){
                        answer += "R";
                        rightLocation[0] = numbers[i] / 3;
                        rightLocation[1] = 1;
                    }else {
                        answer += "L";
                        leftLocation[0] = numbers[i] / 3;
                        leftLocation[1] = 1;
                    }
                }
            }
        }
        return answer;
    }
}