import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int unique = ((int) Math.pow(scanner.nextInt(),2) + (int) Math.pow(scanner.nextInt(),2) + (int) Math.pow(scanner.nextInt(),2) + (int) Math.pow(scanner.nextInt(),2) + (int) Math.pow(scanner.nextInt(),2)) % 10;
        System.out.println(unique);
    }
}

