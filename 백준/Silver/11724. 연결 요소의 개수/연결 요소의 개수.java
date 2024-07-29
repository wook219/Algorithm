import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static boolean[][] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 정점의 개수
        int m = Integer.parseInt(st.nextToken()); // 간선의 개수

        
        arr = new boolean[n+1][n+1]; // 정점이 1부터 시작하기 때문에 n+1로 길이 설정
        visited = new boolean[n+1]; // 방문 여부 체크할 배열

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // a와 b 두 정점이 연결되어 있음을 나타냄.
            arr[a][b] = true;
            arr[b][a] = true;
        }

        int count = 0;

        for (int i = 1; i <= n ; i++) {
            if(!visited[i]){
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }

    static void dfs(int v){
        visited[v] = true;
        for (int i = 1; i <= n; i++) {
            if(arr[v][i] && !visited[i]){
                dfs(i);
            }
        }
    }
}
