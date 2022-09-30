import java.util.Arrays;
import java.util.Scanner;

public class big_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();
        int K = input.nextInt();

        int[] arr = new int[N];
        for (int i=0;i<N;i++) {  //숫자 입력받기
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr); //배열 정렬하기
        int big = arr[N-1];
        int middle_Big = arr[N-2]; //첫번째로 큰것과 두번째로 큰것.
        //System.out.println(big);


    }
}
