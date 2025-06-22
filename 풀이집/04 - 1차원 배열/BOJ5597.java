import java.util.Scanner;

public class BOJ5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] arr = new boolean[30 + 1];

        for (int i = 0; i < 28; i++) {
            arr[sc.nextInt()] = true;
        }

        for (int i = 1; i < arr.length; i++) {
            if (!arr[i]) System.out.println(i);
        }
    }
}