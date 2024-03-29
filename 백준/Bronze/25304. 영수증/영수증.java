import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int N = scanner.nextInt();
        int total = 0;

        for (int i = 1; i <= N; i++) {
            int price = scanner.nextInt();
            int quantity = scanner.nextInt();

            total += price * quantity;
        }

        System.out.println(total == X ? "Yes" : "No");
    }
}
