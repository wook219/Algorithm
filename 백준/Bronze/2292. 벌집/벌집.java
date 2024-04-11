import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int move = 1;
        int num = 2;

        if(N==1){
            System.out.println(N);
        }else {
            while (num <= N) {
                num = num + (6*move);
                move++;
            }
            System.out.println(move);
        }

    }
}

