import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(str.equals("N") || str.equals("n") ? "Naver D2" : "Naver Whale");
    }
}
