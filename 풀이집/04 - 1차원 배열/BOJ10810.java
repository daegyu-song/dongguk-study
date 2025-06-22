import java.util.Arrays;
import java.util.Scanner;

public class BOJ10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int M = sc.nextInt();

        while (M-- > 0) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            Arrays.fill(arr, i - 1, j, k);
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}