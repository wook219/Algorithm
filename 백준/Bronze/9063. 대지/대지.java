
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arrX = new int[N];
        int[] arrY = new int[N];

        for (int i = 0; i < arrX.length; i++) {
            arrX[i] = scanner.nextInt();
            arrY[i] = scanner.nextInt();
        }

        Arrays.sort(arrX);
        Arrays.sort(arrY);

        int area = (arrX[arrX.length-1]-arrX[0]) * (arrY[arrY.length-1]-arrY[0]);
        System.out.println(area);
    }
}

