import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] asc = new int[]{1,2,3,4,5,6,7,8};
        int[] desc = new int[]{8,7,6,5,4,3,2,1};

        String str = "";
        int[] arr = new int[8];

        for (int i = 0; i < 8; i++) {
            arr[i] = scanner.nextInt();
        }

        if(Arrays.equals(asc,arr)){
            str = "ascending";
        }else if(Arrays.equals(desc,arr)){
            str = "descending";
        }else{
            str = "mixed";
        }

        System.out.println(str);
    }
}

