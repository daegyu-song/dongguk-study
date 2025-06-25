import java.util.Arrays;
import java.util.Scanner;

public class BOJ1316 {

    static int N, count;
    static boolean[] arr = new boolean[26];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        count = 0;
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            if (process(sc.nextLine())) count++;
            Arrays.fill(arr, false);
        }

        System.out.println(count);
    }

    static boolean process(String str) {
        char flag = ' ';
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!arr[c - 97]) {
                flag = c;
                arr[c - 97] = true;
            } else {
                if (c != flag) return false;
            }
        }
        return true;
    }
}
