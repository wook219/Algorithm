import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double[] score = new double[N];
        double M = 0;
        double sum = 0;
        double average = 0;
        
        //성적 입력 받음
        for (int i = 0; i < score.length; i++) {
            score[i] = scanner.nextInt();
        }

        //성적 최댓값 찾기
        for (int i = 0; i < score.length; i++) {
            if(M<score[i]){
                M = score[i];
            }
        }

        //점수 조작하기
        for (int i = 0; i < score.length; i++) {
            score[i] = score[i] / M * 100;
        }

        //조작한 점수의 합
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        
        //조작한 점수의 평균
        average = sum / score.length;
        
        System.out.println(average);
    }
}

