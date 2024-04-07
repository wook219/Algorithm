import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();

        String reverseA = "";
        String reverseB = "";

        for (int i = A.length()-1; i >= 0; i--) {
            reverseA += String.valueOf(A.charAt(i));
            reverseB += String.valueOf(B.charAt(i));
        }
        
        System.out.println(Integer.parseInt(reverseA) > Integer.parseInt(reverseB) ? reverseA : reverseB);
    }
}

