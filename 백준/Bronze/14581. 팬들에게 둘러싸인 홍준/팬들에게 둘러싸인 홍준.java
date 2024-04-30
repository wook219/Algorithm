import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str1 = ":" + scanner.next() +":";
        String fan = ":fan:";

        System.out.println(fan+fan+fan);
        System.out.println(fan+str1+fan);
        System.out.println(fan+fan+fan);
    }
}
