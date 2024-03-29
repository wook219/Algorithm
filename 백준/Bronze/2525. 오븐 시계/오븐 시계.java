import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int cookingTime = scanner.nextInt();

        if(minute + cookingTime>=60){
            hour += (minute + cookingTime) / 60;
            minute = (minute + cookingTime) % 60;
            if(hour >= 24){
                hour -= 24;
            }
        }else{
            minute += cookingTime;
        }

        System.out.println(hour +" "+ minute);
    }
}
