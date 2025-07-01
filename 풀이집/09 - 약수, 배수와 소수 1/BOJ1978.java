import java.util.Scanner;

public class BOJ1978 {

    static int answer = 0;
    static int[] arr;

    public static void main(String[] args) {
        input();
        process();

        System.out.println(answer);
    }

    static void process() {
        for (int i : arr) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) count++;
            }
            if (count == 2) answer++;
        }
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
