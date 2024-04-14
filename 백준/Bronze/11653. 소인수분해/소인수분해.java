import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int i = 2;

        while(true){
            if(N==1){
                break;
            }

            if(N % i == 0){
                System.out.println(i);
                N = N / i;
            }else{
                i++;
            }
        }
    }
}
