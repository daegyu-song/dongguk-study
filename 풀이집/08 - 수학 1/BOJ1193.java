import java.util.Scanner;

public class BOJ1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int area = 0;
        int count = 0;
        int[] arr = new int[10000001];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + i;
        }

        for (int i = 1; i < arr.length; i++) {
            if (X <= arr[i]) {
                area = i;
                count = arr[i - 1];
                break;
            }
        }

        if (area % 2 != 0) {
            for (int j = 0; j < area; j++) {
                if (++count == X) System.out.println((area - j) + "/" + (j + 1));
            }
        } else {
            for (int j = area - 1; j >= 0; j--) {
                if (++count == X) System.out.println((area - j) + "/" + (j + 1));
            }
        }
    }
}
