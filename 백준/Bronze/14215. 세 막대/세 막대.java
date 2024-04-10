import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int[] arr = new int[]{x,y,z};
        Arrays.sort(arr);

        int round = 0;

        if(arr[0]+arr[1]>arr[2]){
            round = x + y + z;
        }else{
            round = arr[0] + arr[1] + (arr[0] + arr[1] - 1);
        }

        System.out.println(round);
    }
}

