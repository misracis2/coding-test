import static java.lang.Long.toBinaryString;

class Solution {
public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++){
                        answer[i] = "";
            int[] temp1 = new int[n];
            int[] temp2 = new int[n];
            for(int k = 0; k<n; k++){
                temp1[k] = arr1[i]%2;
                arr1[i] /= 2;
                temp2[k] = arr2[i]%2;
                arr2[i] /= 2;
                if(temp1[k]==0 && temp2[k]==0){
                    answer[i] = " " + answer[i];
                }else{
                    answer[i] = "#" + answer[i];
                }
            }
        }
        return answer;
}
}