import java.util.*;

public class BOJ18870 {

    static int N, count = 0;
    static List<Coordinate3> list = new ArrayList<>();
    static int[] answer;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        input();
        process();

        System.out.println(sb);
    }

    static void process() {
        list.sort(Comparator.comparingInt(c -> c.value));

        answer[list.get(0).idx] = count;
        for (int i = 1; i < list.size(); i++) {

            if (list.get(i).value == list.get(i - 1).value) {
                answer[list.get(i).idx] = count;
            } else {
                answer[list.get(i).idx] = ++count;
            }
        }

        for (int i : answer) {
            sb.append(i).append(" ");
        }
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        answer = new int[N];
        for (int i = 0; i < N; i++) {
            list.add(new Coordinate3(sc.nextInt()));
        }
    }
}

class Coordinate3 {
    static int num = 0;

    int value;
    int idx;

    Coordinate3(int value) {
        this.value = value;
        this.idx = num++;
    }
}
