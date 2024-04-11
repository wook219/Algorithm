import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] arr = new String[5][15];

        for (int i = 0; i < arr.length ; i++) {
            Arrays.fill(arr[i],"*");
        }

        for (int i = 0; i < arr.length; i++) {
            String str = scanner.nextLine();

            char[] chArr = str.toCharArray();

            for (int j = 0; j < chArr.length; j++) {
                arr[i][j] = String.valueOf(chArr[j]);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(arr[j][i].equals("*")){
                    continue;
                }
                System.out.print(arr[j][i]);
            }
        }
    }
}

