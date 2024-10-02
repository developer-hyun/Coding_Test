import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N =  Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=N;i++) {
            for(int j=1; j<=N-i; j++) {
                sb.append(" ");
            }
            for(int k=1;k<=i;k++) {
                sb.append("*");
            }
            System.out.println(sb);
            sb.setLength(0);
        }
    }
}
