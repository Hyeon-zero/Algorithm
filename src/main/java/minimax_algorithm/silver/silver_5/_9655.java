package minimax_algorithm.silver.silver_5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _9655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println((N % 2 == 1) ? "SK" : "CY");
    }
}