import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] chess = new int[]{1,1,2,2,2,8};
        int[] donghyuck = new int[6];
        
        for (int i = 0; i < chess.length; i++) {
            donghyuck[i] = scanner.nextInt();
            System.out.print(chess[i] - donghyuck[i] + " ");
        }
    }
}

