import java.util.*;

public class BOJ1181 {

    static int N;
    static Set<String> set = new HashSet<>();
    static List<String> list;

    public static void main(String[] args) {
        input();
        process();

        for (String s : list) {
            System.out.println(s);
        }
    }

    static void process() {
        list = new ArrayList<>(set);

        list.sort(Comparator.comparingInt(String::length)
                .thenComparing(Comparator.naturalOrder()));
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            set.add(sc.nextLine());
        }
    }
}
