import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            int k = scanner.nextInt();
            int howMany = 0;

            for (int j = 1; j <= k; j++) {
                if(k % j == 0){
                    howMany++;
                }
            }

            if(howMany==2){
                count++;
            }
        }
        System.out.println(count);
    }
}
