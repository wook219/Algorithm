import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[9];
        int idx = 1;
        //배열 만들기
        for (int i = 0; i < arr.length; i++) {
            int element = scanner.nextInt();
            arr[i] = element;
        }
        
        int max = arr[0];

        //배열 최댓값 구하기
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }

        //최댓값 인덱스 구하기
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=max){
                idx++;
            }else{
                break;
            }
        }

        System.out.println(max);
        System.out.println(idx);
        }
    }

