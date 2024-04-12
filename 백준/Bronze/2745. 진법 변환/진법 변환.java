import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        int B = scanner.nextInt();

        long decimal = 0;
        int idx = 0;
        int num = 0;

        for (int i = N.length()-1; i >= 0 ; i--) {
            char ch = N.charAt(i);
            if(ch >= '0' && ch <= '9'){
                num = ch - '0';
            } else {
                num = ch - 55;
            }
            decimal +=  num * Math.pow(B,idx++);
        }
        System.out.println(decimal);
    }
}
