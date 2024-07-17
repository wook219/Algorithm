import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();

        //나오는 횟수
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if(str.length() >= M)
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        //스트림으로 map 가공
        List<String> sorted = map.entrySet().stream() //
                .sorted(Comparator.comparing(Map.Entry<String, Integer>::getValue).reversed()
                        .thenComparing(entry -> entry.getKey().length(), Comparator.reverseOrder())
                        .thenComparing(Map.Entry::getKey))
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();
        for (String s : sorted) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);
    }
}
