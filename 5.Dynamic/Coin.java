import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Coin {

    //N가지 화폐중 최소한으로 이용하여 합이 M원이 되도락한다.
    //
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        int[] arr = new int[N];
        for ( int i=0 ; i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[M+1];
        Arrays.fill(dp,1000);
        dp[0]=0;
        for ( int i=0 ; i<N;i++){
            for ( int j=arr[i] ; j<M+1;j++){
                 dp[j] = Math.min(dp[j],dp[j-arr[i]]+1);
            }
        }
        System.out.println(dp[15]);
        System.out.println(dp[14]);
    }
}
