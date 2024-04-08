import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = new String[]{"c=","c-","dz=","d-","lj","nj","s=","z="};
        for (int i = 0; i <arr.length; i++) {
            if(str.contains(arr[i])){
                str = str.replace(arr[i],"s");
            }
        }
        System.out.println(str.length());
    }
}

