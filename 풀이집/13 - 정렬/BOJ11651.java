import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BOJ11651 {

    static int N;
    static List<Coordinate2> list = new ArrayList<>();

    public static void main(String[] args) {
        input();
        process();

        for (Coordinate2 c : list) {
            System.out.println(c.x + " " + c.y);
        }
    }

    static void process() {
        list.sort(Comparator.comparingInt((Coordinate2 c) -> c.y)
                .thenComparingInt(c -> c.x));
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            list.add(new Coordinate2(sc.nextInt(), sc.nextInt()));
        }
    }
}

class Coordinate2 {
    int x;
    int y;

    public Coordinate2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
