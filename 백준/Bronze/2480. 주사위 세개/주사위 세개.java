import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dice1 = scanner.nextInt();
        int dice2 = scanner.nextInt();
        int dice3 = scanner.nextInt();
        int[] dice = {dice1,dice2,dice3};
        Arrays.sort(dice);

        if(dice1 == dice2 && dice2 == dice3){
            System.out.println(10000 + (dice[0] * 1000));
        }else if(dice1 != dice2 && dice2 != dice3 && dice1 != dice3){
            System.out.println(dice[dice.length-1] * 100);
        }else{
            System.out.println(1000 + (dice[1] * 100));
        }
    }
}
