import java.util.Scanner;

public class BOJ1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        str = str.trim();
        String[] arr = str.split(" ");

        if (arr[0].isEmpty()) System.out.println(0);
        else System.out.println(arr.length);
    }
}