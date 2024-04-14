import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int loop = N;
        String M = String.valueOf(N);

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= loop ; i++) {
            int k = 0;

            for (int j = 0; j < String.valueOf(N).length(); j++) {
                k += String.valueOf(N).charAt(j) - '0';
            }
            if(Integer.parseInt(M) == N + k){
                list.add(N);
            }
            N--;
        }
        System.out.println(list.isEmpty() ? 0 : list.get(list.size()-1));
    }
}
