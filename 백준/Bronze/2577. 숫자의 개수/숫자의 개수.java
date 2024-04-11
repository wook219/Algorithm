import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int[] arr = new int[10];

        String str = Integer.toString(A*B*C);
        char[] arrChar = str.toCharArray();

        for (int i = 0; i < arrChar.length; i++) {
            arr[arrChar[i]-'0']++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

