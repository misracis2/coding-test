class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double[] slopeArr = new double[6];
        int index = 0;
        for(int i = 0; i<3; i++){
            for(int j = i+1; j<4; j++){
                slopeArr[index] = (double)(dots[j][0]-dots[i][0])/(dots[j][1] - dots[i][1]) ;
                index++;
            }
        }
        for(int i = 0; i<5; i++){
            for(int j = i+1; j<6; j++){
                if(slopeArr[i]==slopeArr[j]){
                    answer =1;
                }
            }
        }
        return answer;
    }
}