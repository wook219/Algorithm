
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            int[] arr = new int[]{x,y,z};

            Arrays.sort(arr);
            String angle = "";

            if(arr[arr.length - 1] < arr[0] + arr[1]){
                if (y == z && x == z) {
                    angle = "Equilateral";
                } else if ((x == y && y != z) || (x == z && x != y) || (y == z && y != x)) {
                    angle = "Isosceles";
                } else if (x != y && y != z) {
                    angle = "Scalene";
                }
            }else{
                angle = "Invalid";
            }

            if(x==0){
                break;
            }

            System.out.println(angle);
        }
    }
}

