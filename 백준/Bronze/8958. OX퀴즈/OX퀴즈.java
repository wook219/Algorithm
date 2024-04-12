import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        int score = 0;
        int idx = 0;

        for (int i = 0; i < t; i++) {
            String ox = scanner.next();
            for (int j = 0; j < ox.length(); j++) {
                if(ox.charAt(j)=='X'){
                    idx = 0;
                }else{
                    ++idx;
                    score += idx;
                }
            }
            System.out.println(score);
            score = 0;
            idx = 0;
        }
    }
}
