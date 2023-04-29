import java.util.Scanner;

public class Until_One {
    public static void main(String[] args) throws Exception {

        // 문제 : 수 N이 1이 될때까지 나누려고한다.  1이되는 최소횟수를 구하려라.
        //
        //          조건 1. N에서 1을 뺀다.
        //
        //          조건 2. N을 K로 나눈다.
        //
        //ex) N이 15면  K가 4면 1) N-1 2) N-1 3) N-1 4) N/K  5)N-1 6) N-1   6번이 최소횟수.

        //풀이방법
        //1.

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();

        int result = 0; //최종횟수

        while(true){
            if (N==1){
                break;
            }
            if (N%K==0){
               N = N/K;
            }
            else {
                N = N-1;
            }
            result += 1;

        }
        System.out.println(result);

    }
}
