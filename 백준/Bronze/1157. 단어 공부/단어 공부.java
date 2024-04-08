import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] arr = new int[26];

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)-97]++;
        }

        int max = arr[0];
        int maxIdx = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
                maxIdx = i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(max==arr[i]){
                count++;
            }
        }

        System.out.println(count == 1 ? (char)(65+maxIdx) : "?");
    }
}

