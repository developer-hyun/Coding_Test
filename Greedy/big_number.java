import java.util.Arrays;
import java.util.Scanner;

public class big_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt(); //입력받는 숫자 개수
        int M = input.nextInt(); //M번을 더한다.
        int K = input.nextInt(); //K번을 초과할수 없다.

        int[] arr = new int[N];
        for (int i=0;i<N;i++) {  //숫자 입력받기
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr); //배열 정렬하기
        int big = arr[N-1];
        int middle_Big = arr[N-2]; //첫번째로 큰것과 두번째로 큰것.
        //System.out.println(big);
        int set_number = 0;  //더할 숫자

        while (true) {
            if ( M==0) { break;} //M이 0이면 다 더해서 종ㄹ료
            for (int i = 0; i < K; i++) { //가장 큰수만 k번 반복
                set_number += big;
            }
            M -= K+1; //K번 더하고 두번째 수도 한번 더했기 때문에 M번에서 K+1번 만큼 빼야함
            set_number += middle_Big; //두번째 수도 더하기
        }
        System.out.println(set_number);

//        for (int i=0;i<M;i++) { // M의 숫자만큼 반복하여 더해야한다.
//
//            if(K==0) {break;} //K가 0이되면 반복하여 다 더했기 때문에 끝.
//
//        }



    }
}
