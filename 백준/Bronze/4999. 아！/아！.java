import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.next();
        String str2 = scanner.next();

        System.out.println(str1.length()>=str2.length() ? "go" : "no");
    }
}
