import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BackJoon_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        double[] arr = new double[N];
        for(int i=0 ; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        double Max = arr[N-1];
        double sum =0;
        for(int j=0 ; j<N;j++) {
            double num = (arr[j] / Max) * 100;
            sum += num;
        }
        System.out.println(sum/N);
    }
}
