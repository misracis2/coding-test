import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] chess = {1, 1, 2, 2, 2, 8};
        for (Integer integer : chess) {
            System.out.println(integer- sc.nextInt());
        }
    }
}