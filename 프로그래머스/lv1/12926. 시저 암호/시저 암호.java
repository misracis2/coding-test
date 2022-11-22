class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = new char[s.length()];
        for(int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
            if(arr[i] == 32 ){

            }else if(arr[i] + (char)n > 122){
                arr[i] += (char)n - 26;
            }else if(arr[i] + (char)n > 90 && arr[i]<91){
                arr[i] += (char)n - 26;
            }else{
                arr[i] += (char)n;
            }

            answer += Character.toString(arr[i]);
        }

        return answer;
    }
}