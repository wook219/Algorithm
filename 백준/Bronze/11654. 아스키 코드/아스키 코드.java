import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        if(str.charAt(0)>=97){
            System.out.println('a' + (str.charAt(0) - 97));
        }else if(str.charAt(0)>=65){
            System.out.println('A' + (str.charAt(0) - 65));
        }else if(str.charAt(0)>=48 &&str.charAt(0)<=57){
            System.out.println('0' + (str.charAt(0) - 48));
        }
    }
}

