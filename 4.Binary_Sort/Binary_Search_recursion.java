import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Binary_Search_recursion {

    public static int binary_search(int[] arr, int target, int start , int end) {
        if ( start>end) {return -1;  //찾고자하는 숫자가없을때
        }
        int mid = (start + end) /2;

        //타겟과 중간점이 일치하면 반환
        if ( target == arr[mid]) {
            return mid;
        }
        //타겟이 중간값보다 작은 경우에는 왼쪽을 탐색해야한다.
        if ( target < arr[mid]) {
            return binary_search(arr,target,start,mid-1);
        }
        else {
            return binary_search(arr,target,mid+1,end);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(bf.readLine());
        for ( int i=0 ; i<N;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int result = binary_search(arr,7,0,N-1);
        System.out.println(result+1);
    }
}
