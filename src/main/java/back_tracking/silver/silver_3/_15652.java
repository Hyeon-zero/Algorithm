package back_tracking.silver.silver_3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _15652 {
    static int N, M;
    static int[] arr;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    public static void dfs(int startNode, int backTracking){
        if(backTracking == M){
            for(int val : arr){
                sb.append(val + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i = startNode; i <= N; i++){
            arr[backTracking] = i;
            dfs(i, backTracking + 1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visited = new boolean[N + 1];

        dfs(1, 0);

        System.out.println(sb);
    }
}