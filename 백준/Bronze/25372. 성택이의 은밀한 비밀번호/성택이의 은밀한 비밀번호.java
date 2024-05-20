import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            String str = scanner.next();

            System.out.println(str.length() >= 6 && str.length() <= 9 ? "yes" : "no");
        }
    }
}
