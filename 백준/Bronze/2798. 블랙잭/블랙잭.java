import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] arr = new int[N];

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1 ; j++) {
                for (int k = j + 1; k < N; k++) {
                    int tmp = 0;
                    tmp = arr[i] + arr[j] + arr[k];

                    if(sum < tmp && tmp < M || tmp == M){
                        sum = tmp;
                    }
                }
            }
        }

        System.out.println(sum);
    }
}
