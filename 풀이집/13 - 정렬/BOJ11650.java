import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BOJ11650 {

    static int N;
    static List<Coordinate> list = new ArrayList<>();

    public static void main(String[] args) {
        input();
        process();

        for (Coordinate c : list) {
            System.out.println(c.x + " " + c.y);
        }
    }

    static void process() {
        list.sort(Comparator.comparing((Coordinate c) -> c.x)
                .thenComparingInt(c -> c.y));
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            list.add(new Coordinate(sc.nextInt(), sc.nextInt()));
        }
    }
}

class Coordinate {
    int x;
    int y;

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

