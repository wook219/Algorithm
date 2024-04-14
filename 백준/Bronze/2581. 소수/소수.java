import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();

        int sum = 0;
        int min = 0;

        for (int i = M; i <= N; i++) {
            int howMany = 0;
            for (int j = 1; j <= i; j++) {
                if(i % j == 0){
                    howMany++;
                }
            }

            if(howMany == 2){
                sum += i;
                if(min == 0){
                    min = i;
                }
            }
        }
        if(sum == 0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
