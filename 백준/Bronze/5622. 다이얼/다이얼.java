import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] arr = new int[]{3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
        int sec = 0;

        for (int i = 0; i < str.length(); i++) {
            sec += arr[(str.charAt(i)-65)];
        }

        System.out.println(sec);
    }
}

