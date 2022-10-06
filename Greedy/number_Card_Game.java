import java.util.Arrays;
import java.util.Scanner;

public class number_Card_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int result=0;//결과값

        int [][] arr = new int[N][M];

        for (int i=0; i<N;i++) {
            for (int j=0 ; j<M;j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        //System.out.println(Arrays.deepToString(arr));
        for (int i=0; i<N;i++){
            int  min_number =arr[i][0];
            for (int j=0; j<M;j++){
                if (min_number >= arr[i][j]) {
                    min_number = arr[i][j];
                //    System.out.println(min_number);
                }
            }

            if (result <= min_number) {
                result = min_number;
            }
            //System.out.println(result);
        }
        System.out.println(result);

//        for (int i=0;i<N;i++) { //행
//            int min_number=100001; //최소값
//            for(int j=0;j<M ;j++){ //열. 열 중에 가장 작은 값을 구한다.
//                int input = scanner.nextInt();
//                min_number = Math.min(min_number,input);
//            }
//            //System.out.println(min_number);
//            result = Math.max(result,min_number); //결과값은 result의값(기존 행의 가장작은값) vs(min_number 새로운 행의 가장 작은값) 중에서 결정.
//            //result의 값이 사실상 최대값임.
//
//        }
//        System.out.println(result);
    }
}
