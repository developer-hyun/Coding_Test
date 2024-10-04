import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =  new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for(int i=0 ; i<arr.length; i++) {
            arr[i] = i+1;
        }
        int temp =0;
        for(int j=0 ; j<M;j++) {
            st =  new StringTokenizer(bf.readLine()," ");
            int I = Integer.parseInt(st.nextToken())-1;
            int J = Integer.parseInt(st.nextToken())-1;
            while (I<J) {
                temp = arr[I];
                arr[I] = arr[J];
                arr[J] = temp;
                I++;
                J--;
            }
        }
        for(int k=0 ; k<N;k++) {
            System.out.print(arr[k]+" ");
        }
    }
}
