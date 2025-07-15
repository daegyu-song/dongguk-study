import java.util.*;

public class BOJ7785 {

    static int N;
    static Map<String, String> map = new HashMap<>();
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        input();
        process();

        for (String answer : list) {
            System.out.println(answer);
        }
    }

    static void process() {
        list = new ArrayList<>(map.keySet());
        list.sort(Comparator.reverseOrder());
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            String[] arr = sc.nextLine().split(" ");
            String name = arr[0];
            String check = arr[1];
            if (check.equals("enter")) map.put(name, "enter");
            else map.remove(name);
        }
    }
}
