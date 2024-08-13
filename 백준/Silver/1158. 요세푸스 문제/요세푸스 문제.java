import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while(!q.isEmpty()){
            int num = 0;

            for (int i = 1; i <= K-1; i++) {
                num = q.poll();
                q.offer(num);
            }

            if(q.size() == 1){
                sb.append(q.poll());
            }else{
                sb.append(q.poll()).append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}
