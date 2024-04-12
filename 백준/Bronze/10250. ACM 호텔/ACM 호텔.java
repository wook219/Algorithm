import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int H = scanner.nextInt();
            int W = scanner.nextInt();
            int N = scanner.nextInt();

            int floor = 0; //층수
            int num = 0; //호수

            //층, 호 구하기
            if(H==1){
                floor = 1;
                for (int j = 1; j <= N; j++) {
                    num++;
                }
            }else{
                for (int j = 1; j <= N; j++) {
                    floor = j % H;

                    if(j%H==0){
                        floor = H;
                    }

                    if(j % H == 1){
                        num++;
                    }
                }
            }
            

            System.out.println(N==1 ? (floor * 100) + 1 :(floor * 100) + num);
        }
    }
}
