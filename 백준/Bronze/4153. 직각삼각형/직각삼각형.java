import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            int[] arr = new int[]{x,y,z};
            Arrays.sort(arr);

            if(x == 0 && y == 0 & z == 0){
                break;
            }

            System.out.println(Math.pow(arr[2],2) == Math.pow(arr[0],2) + Math.pow(arr[1],2) ? "right" : "wrong");
        }
    }
}
