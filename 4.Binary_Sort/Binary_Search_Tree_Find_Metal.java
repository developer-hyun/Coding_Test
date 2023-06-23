import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Binary_Search_Tree_Find_Metal {
    public static int binarySearch(Integer[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            // 찾은 경우 중간점 인덱스 반환
            if (arr[mid] == target) return mid;
                // 중간점의 값보다 찾고자 하는 값이 작은 경우 왼쪽 확인
            else if (arr[mid] > target) end = mid - 1;
                // 중간점의 값보다 찾고자 하는 값이 큰 경우 오른쪽 확인
            else start = mid + 1;
        }
        return -1;
    }


    //부품찾기
    //부품이 N개있다. 손님이 M개 종류의 부품을 구매하고자한다.
    //가게에 부품이 모두 있는지 확인해 보자..
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Integer N = Integer.parseInt(bf.readLine());
        Integer[] arrS = new Integer[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            arrS[i] = Integer.parseInt(st.nextToken());
        }

        Integer M = Integer.parseInt(bf.readLine());
        Integer[] arrP = new Integer[M];
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < M; i++) {
            arrP[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrS);
        for (int i = 0; i < M; i++) {
            int result = binarySearch(arrS, arrP[i], 0, N - 1);
            if (result == -1) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }


        }
    }
}
