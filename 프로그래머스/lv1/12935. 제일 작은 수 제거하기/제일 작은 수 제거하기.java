class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        int compare = arr[0];
        int num = 0;
        //arr.lenth = 1 이면 {-1} 리턴
        if(arr.length == 1) {
            return answer;
        }
        //제일 작은 수의 값과 위치 찾기
        for(int i = 0; i < arr.length; i++) {
            if(compare > arr[i]) {
                compare = arr[i];
                num = i;
            }
        }
        //arr에서 num번째 값을 뺀 데이터를 새로운 배열에 넣기
        answer = new int[arr.length-1];
        for(int i = 0; i < arr.length-1; i++) {
            if(i < num) {
                answer[i] = arr[i];
            }else {
                answer[i] = arr[i+1];
            }
        }
        return answer;
    }
}