import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Plus_Number {

    //1번째 줄에 숫자의 개수 , 2번째 줄에 숫자 N개가 주어진다.
    //입력으로 주어진 숫자 N개의 합을 출력한다.

    //1.입력받기
    //2.입력받을때 12345를 string으로 받은다음 tocharArray로 char배열로 변환하기
    //3. for문으로 char배열을 돌면서 아스키코드를 활용하여 sum에 합하기

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long N = Integer.parseInt(bf.readLine());
        String strings = bf.readLine();
        char[] chars = strings.toCharArray();
        int sum=0;
        for(int i=0 ; i< chars.length ; i++) {
            sum += chars[i]-'0'; //혹은 48
        }
        System.out.println(sum);
    }
}
