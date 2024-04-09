
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int max = 0;
        int row = 0;
        int column = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(max<arr[i][j]){
                    max = arr[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println(max);
        System.out.print((row+1) + " " + (column+1));
    }
}

