
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        String angle = "";

        if(x == 60 & y == 60 && z == 60){
            angle = "Equilateral";
        }else if(x + y + z == 180 && (x == y || y == z || x == z)){
            angle = "Isosceles";
        }else if(x + y + z == 180 && (x != y || y != z)){
            angle =  "Scalene";
        }else if(x + y + z != 180){
            angle = "Error";
        }

        System.out.println(angle);
    }
}

