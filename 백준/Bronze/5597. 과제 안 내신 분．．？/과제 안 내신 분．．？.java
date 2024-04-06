import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] studentNum = new int[28];
        int[] arr = new int[31];
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < studentNum.length; i++) {
            studentNum[i] = scanner.nextInt();
        }
       
        for (int i = 0; i < studentNum.length; i++) {
            arr[studentNum[i]]++;
        }

        for (int i = 0; i <arr.length; i++) {
            if(arr[i]==0 && num1 == 0){
                num1 = i;
            }

            if(arr[i]==0 && num1 != 0){
                num2 = i;
            }
        }

        System.out.println(num1);
        System.out.println(num2);

    }
}

