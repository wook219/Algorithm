import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        //분이 45이상이면 그냥 뺀다.
        if(minute>=45){
            minute -= 45;
        }else{
            //분이 45 미만이면 60에서 45를 뺀 후 minute를 더한다.
            minute = 60 - 45 + minute;
            //분이 45 미만일 때, 시가 0이면 23으로
            if(hour == 0){
                hour = 23;
            }else{
                //아닐땐 그냥 뺸다.
                hour -= 1;
            }
        }

        System.out.println(hour + " " + minute);
    }
}
