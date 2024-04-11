import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        int quarter = 0;
        int dime = 0;
        int nickel = 0;
        int penny = 0;

        for (int i = 0; i < T; i++) {
            int money = scanner.nextInt();

            quarter = money / 25;
            money %= 25;

            dime = money / 10;
            money %= 10;

            nickel = money / 5;
            money %= 5;

            penny = money;

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
    }
}

