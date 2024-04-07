import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if(String.valueOf(str.charAt(i)).equals(" ")){
                count++;
            }
        }

        if(String.valueOf(str.charAt(0)).equals(" ")){
            count--;
        }

        if(String.valueOf(str.charAt(str.length() - 1)).equals(" ")){
            count--;
        }

        System.out.println(count);
    }
}

