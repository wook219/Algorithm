import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int[] arr = new int[26];

        Arrays.fill(arr,-1);

        for (int i = 0; i < S.length(); i++) {
            if(arr[S.charAt(i)-97]==-1) {
                arr[S.charAt(i) - 97] = i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

