import java.util.Scanner;

public class BOJ1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];
        String str = sc.nextLine();
        String answer = "";
        int max = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') arr[c - 97]++;
            if (c >= 'A' && c <= 'Z') arr[c - 65]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) continue;
            if (arr[i] > max) {
                max = arr[i];
                answer = String.valueOf((char)(i + 65));
            }
        }

        for (int i : arr) {
            if (max == i) count++;
        }

        System.out.println(count >= 2 ? "?" : answer);
    }
}
