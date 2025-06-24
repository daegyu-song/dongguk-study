import java.util.Scanner;

public class BOJ2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String answer = str.replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=", " ");

        System.out.println(answer.length());
    }
}