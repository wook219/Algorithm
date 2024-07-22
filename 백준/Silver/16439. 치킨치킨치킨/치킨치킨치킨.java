import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[][] like;
    static boolean[] visit;
    static int max;
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        like = new int[N][M];
        visit = new boolean[M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                like[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,0);

        System.out.println(max);
    }

    static void dfs(int start, int depth){
        if(depth == 3){
            int sum = 0;
            for (int i = 0; i < N; i++) {
                int temp = 0;
                for (int j = 0; j < M; j++) {
                    if(visit[j]){
                        temp = Math.max(temp, like[i][j]);
                    }
                }
                sum += temp;
            }
            max = Math.max(sum, max);
            return;
        }

        for (int i = start; i < M; i++) {
            if(!visit[i]){
                visit[i] = true;
                dfs(i + 1, depth + 1);
                visit[i] = false;
            }
        }
    }
}
