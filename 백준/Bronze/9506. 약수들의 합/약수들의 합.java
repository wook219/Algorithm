import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            int n = scanner.nextInt();
            int sum = 0;

            if(n == -1){
                break;
            }

            for (int i = 1; i < n; i++) {
                if(n % i == 0){
                    sum += i;
                }
            }

            String str = n + " = ";

            if(n == sum){
                for (int i = 1; i < n; i++) {
                    str += n % i == 0 ? i + " + " : "";
                }
                System.out.println(str.substring(0,str.length()-3));
            }else{
                System.out.println(n + " is NOT perfect.");
            }
        }


    }
}
