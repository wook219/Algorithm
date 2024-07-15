import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        // 1. 정수를 잘라서 보관할 list 생성
        List<String> list = new ArrayList<>();

        // 2. 정수를 자를 때 사용할 sb생성
        StringBuilder sb = new StringBuilder();

        //3. sb에 한글자씩 검사하며 sb에 추가. 특정조건을 만족하면 sb를 list에 추가하고 sb를 비워줌.
        //특정 조건 : 부호를 만났을 때
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(Character.isDigit(ch)){ //isDigit(Char ch) -> 숫자인지
                sb.append(ch);
            }else{
                list.add(sb.toString());
                sb.setLength(0);
                sb.append(ch);
                list.add(sb.toString());
                sb.setLength(0);
            }

            // 마지막 값 추가
            if(i == str.length() - 1){
                list.add(sb.toString());
            }
        }

//        -> list에 부호를 포함한 정수들이 저장되어 있음.

        int min = 0;
        boolean minus = false;

        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);

            if(element.equals("-")){
                minus = true;
            }else if(element.equals("+")){

            }else{
                if(minus){
                    min -= Integer.parseInt(element);
                }else{
                    min += Integer.parseInt(element);
                }
            }
        }

        System.out.println(min);
    }
}
