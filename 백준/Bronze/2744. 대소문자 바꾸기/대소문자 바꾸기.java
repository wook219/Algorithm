import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)>96 ? (char)(str.charAt(i)-32) : (char)(str.charAt(i) + 32));
        }
    }
}
