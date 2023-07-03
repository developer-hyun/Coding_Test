import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ant_Worrier {

    //식량창고에서 식량을 뺏는다.
    //한칸 이상 떨어진 식량창고를 약탈해야한다.
    //1 3 1 5 면 두번째와 네번째를 약탈해 8개의 식량이다.
    //식량을 최대로 구하도록 하시오

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i=0 ; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] max = new int[N+1];
        max[0] = arr[0];
        max[1] = Math.max(arr[0],arr[1]);

        for ( int i=2 ; i<N ; i++){
            max[i] = Math.max(max[i-1],max[i-2]+ arr[i]);
        }
        System.out.println(max[N-1]);

    }

}
