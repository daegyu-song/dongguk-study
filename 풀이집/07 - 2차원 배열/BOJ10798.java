import java.util.Scanner;

public class BOJ10798 {

    static String[] arr = new String[5];

    public static void main(String[] args) {
        input();

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].length() <= i) continue;
                System.out.print(arr[j].charAt(i));
            }
        }
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }
    }
}