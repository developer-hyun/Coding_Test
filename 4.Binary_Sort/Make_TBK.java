
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
    public class Make_TBK {
        public static int N,M;

        public static int binarySearch(int[] arr, int target, int start, int end) {
            int result = 0;
            while (start <= end) {
                int mid = (start + end) / 2;
                int total = 0;
                for ( int i=0 ; i<N; i++) {
                    if ( arr[i] >mid) {
                    total = total + (arr[i] - mid);
                }}
                if ( total == target) {
                    return mid;
                }
                if ( total < target) {
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            return -1;
        }
        //절단기 높이 H을 지정하면 떡이 잘린다. H보다 긴떡은 잘리고 짧은 떡은 잘리지 않는다.
        //19,14,10,17 이고 H가 15 면 15,14,10,15 가 되고 4,2가 남아 손님이 6을 가져가낟.
        //요청한 길이가 M일때  M의 떡을 얻기위해 설정할수 있는 높이의 최대값을 구해라.
        public static void main(String[] args) throws IOException {

            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(bf.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            int[] arrD = new int[N];
            st = new StringTokenizer(bf.readLine());
            for ( int i=0 ; i<N;i++){
                arrD[i] = Integer.parseInt(st.nextToken());
            }
            int[] arrCopy = arrD;
            Arrays.sort(arrCopy);
            int max = arrCopy[N-1];

            int result =binarySearch(arrD,6,0,max);
            System.out.println(result);


        }
    }


