import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int v = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == v){
                count++;
            }
        }
        System.out.println(count);
        }
    }

