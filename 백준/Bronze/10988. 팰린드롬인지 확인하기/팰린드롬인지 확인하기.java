import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str1 = "";
        String str2 = "";

        if(str.length()%2==0){
            for (int i = 0; i < str.length()/2; i++) {
                str1 += String.valueOf(str.charAt(i));
                str2 += String.valueOf(str.charAt(str.length()-1-i));

            }
        }else{
            for (int i = 0; i < str.length()/2+1; i++) {
                str1 += String.valueOf(str.charAt(i));
                str2 += String.valueOf(str.charAt(str.length()-1-i));

            }
        }

        System.out.println(str1.equals(str2) ? 1 : 0);
    }
}

