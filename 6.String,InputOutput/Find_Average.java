import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Find_Average {

    //최댓값을 M이라 했을때 점수를 점수/M*100이라 한다.
    //이 방법으로 평균을 구하는 프로그램을 작성하라.
    //첫번째 줄에는 개수N  2번째 줄에는 현재 성적.


    //1.입력받기
    //(점수A/M *100 ) + (점수B/M *100 ) + (점수C/M *100 )  /3   == (A+B+C ) * 100 / M /3

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int sum=0;
        int[] numberArr = new int[N];
        for(int i=0 ; i<N ; i ++) {
            int M = Integer.parseInt(st.nextToken());
            numberArr[i] = M;
            sum += M;
        }
        int max= Arrays.stream(numberArr).max().getAsInt();

        System.out.println(sum*100.0/max/N);

    }
}
