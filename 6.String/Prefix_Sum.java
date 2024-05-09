import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prefix_Sum {

    //첫째줄에 개수 N과  합을 구해야하는 횟수 M
    //두번째 줄에는 N개의 숫자. 세번째 줄에는 M개의 줄에 합을 구해야하는 구간 i와 j가 주어진다.

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];
        int[] plus_arr = new int[N+1];
        plus_arr[0] =0;

        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        for(int i=1 ; i<N+1 ; i ++) {
            arr[i] = Integer.parseInt(st1.nextToken());
            plus_arr[i] = plus_arr[i-1] + arr[i];
        }


        for(int i=0 ; i<M ; i ++) {
            StringTokenizer st2 = new StringTokenizer(bf.readLine());
            int I = Integer.parseInt(st2.nextToken());
            int J = Integer.parseInt(st2.nextToken());

            System.out.println(plus_arr[J] - plus_arr[I-1]);
        }


    }
}
