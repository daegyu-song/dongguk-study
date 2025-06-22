import java.util.Scanner;

public class BOJ10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int M = sc.nextInt();

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        while (M-- > 0) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;

            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}