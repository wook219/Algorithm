import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        // 1. List를 생성해서 좌표들을 입력받음
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }

        //2. 작은수부터 정렬
        List<Integer> sorted = list.stream()
                .sorted()
                .collect(Collectors.toList());

        //3.
        Map<Integer, Integer> ranking = new HashMap<>();
        int rank = 0;


        for (int i = 0; i < sorted.size(); i++) {
            int num = sorted.get(i);
            if(!ranking.containsKey(num)){
                ranking.put(num, rank);
                rank++;
            }
        }

        //
        List<Integer> compression =  new ArrayList<>();

        for (Integer i : list) {
            compression.add(ranking.get(i));
        }
        
        StringBuilder sb = new StringBuilder();

        for (Integer i : compression) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }

}
