import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int L = scanner.nextInt();
        String str = scanner.next();
        long hashValue = 0;

        for (int i = 0; i < L; i++) {
            hashValue += (long) ((str.charAt(i)-'a'+1) * Math.pow(31,i));
        }

        System.out.println(hashValue);
    }
}
