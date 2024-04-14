import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int L = scanner.nextInt();
        String str = scanner.next();
        long hashValue = 0;
        long pow = 1;
        
        for (int i = 0; i < L; i++) {
            hashValue += ((str.charAt(i)-'a'+1) * pow);
            pow = (pow * 31) % 1234567891;
        }

        System.out.println(hashValue % 1234567891);
    }
}
