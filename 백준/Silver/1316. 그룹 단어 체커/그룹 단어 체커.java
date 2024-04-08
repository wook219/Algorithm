
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = N;

        for (int i = 0; i < N; i++) {
            String str = scanner.next();
            boolean test[] = new boolean[26];

            for (int j = 0; j < str.length()-1; j++) {
                if(str.charAt(j)!=str.charAt(j+1)){
                    if(test[str.charAt(j+1)-97]==true){
                        count--;
                        break;
                    }
                }
                test[str.charAt(j)-97]=true;
            }
        }
        System.out.println(count);
    }
}

