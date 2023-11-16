import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

public class Multiply_Plus {

    //숫자로만 이루어진 문자열 S가 주어졌을때
    //왼쪽에서 오른쪽으로 숫자 사이에 X또는 +를 넣어서 만들어 질수 있는 가장 큰 수를 구하시오.
    //단, 일반적인 연산과달리 +,X 에는 우선순위가 없습니다.

    //가장 큰수 -> 그리디생각
    //0또는 1이 아니라면 X가 가장 클것임.
    //0또는 1이있으면 근처숫자중 작은숫자와 결합해야함.


    public static ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String num = bf.readLine();

        int result = 0;
        result = num.charAt(0) - '0';  //첫번째 자리를 대입
        for (int i = 1; i < num.length(); i++) {
            int nownum = num.charAt(i) - '0'; //현재 자리 숫자
            if (nownum <= 1 || result <= 1) {
                result += nownum;
            } else {
                result *= nownum;
            }
        }
        System.out.println(result);
    }
}
