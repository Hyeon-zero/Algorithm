package dynamic_programming.silver.silver_4;
import java.io.*;
public class _9507 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        long[] dp = new long[68];
        dp[0] = 1; dp[1] = 1;
        dp[2] = 2; dp[3] = 4;

        for(int i = 4; i <= 67; i++) dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3] + dp[i - 4];

        while(testCase --> 0) {
            int n = Integer.parseInt(br.readLine());

            sb.append(dp[n] + "\n");
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}