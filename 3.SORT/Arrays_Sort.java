import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Arrays_Sort {

    //배열 A와 B가 있다.
    //K번 바꿔치기를 하는데 이것은 두개의 배열을 서로 바꾸는 것이다.
    //최종목표는 A의 원소의 합이 최대가 되는것.
    //최소와 최대의 교환 정렬 후.


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Integer[] arrA = new Integer[N];
        Integer[] arrB = new Integer[N];

        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        for (int i=0 ; i<N; i++) {
            arrA[i] = Integer.parseInt(st1.nextToken());
        }
        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        for (int i=0 ; i<N; i++) {
            arrB[i] = Integer.parseInt(st2.nextToken());
        }

        //System.out.println(Arrays.toString(arrA));
        Arrays.sort(arrA);
        Arrays.sort(arrB, Collections.reverseOrder());
        int result =0;

        for (int i=0 ; i<M; i++) {
            if (arrA[i] < arrB[i] ) {

                Integer tmp = arrA[i];
                arrA[i] = arrB[i];
                arrB[i] = tmp;
            }
            result += arrA[i];
        }
        System.out.println(Arrays.toString(arrA));
        System.out.println(result);
    }
}
