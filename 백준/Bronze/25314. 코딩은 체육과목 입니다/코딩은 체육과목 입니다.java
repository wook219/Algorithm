import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bt = scanner.nextInt() / 4;
        String dataType = "int";

        for (int i = 1; i <= bt; i++) {
            dataType = "long " + dataType;
        }
        System.out.println(dataType);
    }
}
