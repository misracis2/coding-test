class Solution {
    public int solution ( int n){
        int answer = 0;
        int i = 1;
        while(true){
            if(i%2==1){
                if(n%i==0){
                    answer++;
                }
            }else if(i%2==0){
                if((n+i/2)%i==0){
                    answer++;
                }
            }
            i++;
            if(n/i < (double)i/2 ){
                break;
            }
        }
        return answer;
    }
}