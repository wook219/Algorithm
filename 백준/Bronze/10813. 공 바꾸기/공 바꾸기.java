import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] basket = new int[N];

        for (int i = 0; i < basket.length; i++) {
            basket[i] = i+1;
        }

        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int tmp = 0;

            tmp = basket[a-1] ;
            basket[a-1] = basket[b-1];
            basket[b-1] = tmp;
        }

        for (int i = 0; i < basket.length; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}

