import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BOJ10815 {

    static int N, M;
    static Map<Integer, Integer> map = new HashMap<>();
    static StringBuilder sb = new StringBuilder();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        input();

        System.out.println(sb.toString());
    }

    static void input() {
        N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            map.put(sc.nextInt(), 1);
        }

        M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            if (map.containsKey(sc.nextInt())) sb.append(1).append(" ");
            else sb.append(0).append(" ");
        }
    }
}
