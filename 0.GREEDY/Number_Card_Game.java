import java.util.Scanner;

public class Number_Card_Game {

    public static void main(String[] args) {

        //문제
        //여러개의 카드중에서 가장 높은 숫자가 쓰인 카드 한장을 뽑아야한다.
        //카드는 N행 M열 형태로있으며 행을 선택하고 해당 행에 카드등 중 가장 숫자가 낮은 카드를 뽑아한다.
        //ex) 312 414 222 면 세번째 행을 선택해야한다.


        //풀이방법
        //1. N행과 M열을 입력받아야한다.
        //2. N행M열에 해당하는 숫자를 입력받아야한다(2차원배열)
        //3. 1)각 행별로 최소값을 뽑아 배열에 저장 후   그 중 최대값을 도출.
        //3. 2)처음부터시작해서 끝까지 최소값을 비교하면서 가는방향
        //  1)은 2번작업해야하므로 시간이 더 걸릴것으로 예측되어 2로 진행


        Scanner input = new Scanner(System.in);
        int N = input.nextInt(); //N행
        int M = input.nextInt();//M열
        int[][] arr = new int[N][M];// 숫자를 저장할 배열

        for(int i=0;i<N;i++){  //2중배열에다가 숫자를 받기
            for(int j=0;j<N;j++){
                arr[i][j] = input.nextInt();
            }
        }

        int result_num = 0; //결과값

        for(int i=0; i<N; i++) {
            int min_number = arr[i][0]; //새로운 행의 첫값을 최소값으로 일단시작
            for (int j=0; j<N; j++) {
                if(min_number >= arr[i][j]){
                    min_number = arr[i][j]; //해당 행의 최소숫자가 더 크면 해당 행렬의 최소숫자로변환
                }
            }
            //여기까지오면 해당 행의 최소숫자가 min_number일것임.
            //그러면 이제 min_number을 다른행의 최소값과 비교해야함
            if(result_num <=min_number) {
                result_num = min_number; //최종값을 더 큰숫자로 변환
            }
        }
        System.out.println(result_num);








    }
}
