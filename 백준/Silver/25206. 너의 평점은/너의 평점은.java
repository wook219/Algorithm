import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double creditSum = 0.0; // 학점 총합
        double subSum = 0.0; //전공 과목별 합
        double average; //전공 평점

        for (int i = 0; i < 20; i++) {
            String subName = scanner.next();
            double credit = scanner.nextDouble();
            String grade = scanner.next();
            //과목 평점
            double score = grade.equals("A+") ? 4.5 : grade.equals("A0") ? 4.0 : grade.equals("B+") ? 3.5 : grade.equals("B0") ? 3.0 : grade.equals("C+") ? 2.5 : grade.equals("C0") ? 2.0 : grade.equals("D+") ? 1.5 : grade.equals("D0") ? 1.0 : 0.0;

            if(grade.equals("P")){
                credit = 0.0;
            }

            creditSum += credit;
            subSum += (credit * score);
        }
        average = subSum / creditSum;

        System.out.println(average);
    }
}

