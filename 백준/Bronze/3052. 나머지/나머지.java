import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int count = 0;
        int[] arr2 = new int[42];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt() % 42;
        }

        for (int i = 0; i < arr.length; i++) {
            arr2[arr[i]]++;
        }

        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i]!=0)
                count++;
        }

        System.out.println(count);
    }
}

