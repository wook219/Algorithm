import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        BigInteger big = scanner.nextBigInteger();
        BigInteger big2 = scanner.nextBigInteger();
        
        System.out.println(big.divide(big2));
        System.out.println(big.remainder(big2));
    }
}
