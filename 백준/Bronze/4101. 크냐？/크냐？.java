import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            
            if(n == 0 && m == 0){
                break;
            }
            System.out.println(n > m ? "Yes" : "No");
        }
    }
}
