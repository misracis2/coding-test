import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String ret ="";
        int a = Integer.parseInt(br.readLine());
        int remain = a % 5;
        switch(remain) {
            case 0: ret = String.valueOf(a / 5);break;
            case 1: ret = a < 6 ? "-1" : String.valueOf((a - 6) / 5 + 2);break;
            case 2: ret = a < 12 ? "-1" : String.valueOf((a - 12) / 5 + 4);break;
            case 3: ret = a<3 ? "-1" : String.valueOf((a-3)/5 +1); break;
            case 4: ret = a < 9 ? "-1" : String.valueOf((a-9)/5 +3); break;
        }

        bw.write(ret);
        bw.newLine();
        bw.flush();
        bw.close();
    }
}