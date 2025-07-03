import java.util.Scanner;

public class BOJ2798 {

    static int N, M, max = Integer.MIN_VALUE;
    static int[] arr;

    public static void main(String[] args) {
        input();
        process();

        System.out.println(max);
    }

    static void process() {
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum == M) {
                        max = sum;
                        return;
                    }
                    if (sum < M && sum > max) max = sum;
                }
            }
        }
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
