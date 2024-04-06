import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= T ; i++) {
            String str = scanner.nextLine();

            System.out.println(String.valueOf(str.charAt(0))+String.valueOf(str.charAt(str.length()-1)));
        }
    }
}

