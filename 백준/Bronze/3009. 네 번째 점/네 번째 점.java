
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;

        int[] arrX = new int[3];
        int[] arrY = new int[3];

        for (int i = 0; i < arrX.length; i++) {
            arrX[i] = scanner.nextInt();
            arrY[i] = scanner.nextInt();
        }

        Arrays.sort(arrX);
        Arrays.sort(arrY);

        if(arrX[0]==arrX[1]){
            x = arrX[2];
        }else if(arrX[arrX.length-1]==arrX[arrX.length-2]){
            x = arrX[0];
        }

        if(arrY[0]==arrY[1]){
            y = arrY[2];
        }else if(arrY[arrY.length-1]==arrY[arrY.length-2]){
            y = arrY[0];
        }

        System.out.print(x + " " + y);
    }
}

