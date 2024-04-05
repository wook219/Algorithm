import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] arr1 = new int[N];

        for (int i = 0; i < N; i++) {
            arr1[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if(arr1[i]<X){
                System.out.print(arr1[i] + " ");
            }
        }
    }
}

