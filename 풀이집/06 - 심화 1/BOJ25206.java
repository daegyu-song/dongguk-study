import java.util.Scanner;

public class BOJ25206 {

    static double creditGradeSum = 0;
    static double creditSum = 0;

    public static void main(String[] args) {
        input();
        System.out.println(creditGradeSum / creditSum);
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            sc.next();
            double credit = sc.nextDouble();
            String grade = sc.next();
            sc.nextLine();
            process(credit, grade);
        }
    }

    static void process(double credit, String grade) {
        if (!grade.equals("P")) {
            switch (grade) {
                case "A+":
                    creditGradeSum += credit * 4.5;
                    creditSum += credit;
                    break;
                case "A0":
                    creditGradeSum += credit * 4.0;
                    creditSum += credit;
                    break;
                case "B+":
                    creditGradeSum += credit * 3.5;
                    creditSum += credit;
                    break;
                case "B0":
                    creditGradeSum += credit * 3.0;
                    creditSum += credit;
                    break;
                case "C+":
                    creditGradeSum += credit * 2.5;
                    creditSum += credit;
                    break;
                case "C0":
                    creditGradeSum += credit * 2.0;
                    creditSum += credit;
                    break;
                case "D+":
                    creditGradeSum += credit * 1.5;
                    creditSum += credit;
                    break;
                case "D0":
                    creditGradeSum += credit * 1.0;
                    creditSum += credit;
                    break;
                default:
                    creditGradeSum += credit * 0.0;
                    creditSum += credit;
                    break;
            }
        }
    }
}
