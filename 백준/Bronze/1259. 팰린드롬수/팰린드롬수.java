import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            String num = scanner.next();
            if(num.equals("0")){
                break;
            }

            String p1 = "";
            String p2 = "";

            for (int i = 0; i < num.length()/2; i++) {
                p1 += String.valueOf(num.charAt(i));
            }

            if(num.length()%2==0){
                for (int i = num.length()-1; i >= num.length()/2; i--) {
                    p2 += String.valueOf(num.charAt(i)) ;
                }
            }else{
                for (int i = num.length()-1; i > num.length()/2; i--) {
                    p2 += String.valueOf(num.charAt(i)) ;
                }
            }

            System.out.println(p1.equals(p2) ? "yes" : "no");
        }
    }
}
