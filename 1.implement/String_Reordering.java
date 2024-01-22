import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class String_Reordering {

    //알파벳 대문자와 숫자(0~9)로만 구성된 문자열이 주어진다.
    //이때 모든 알파벳을 오름차순으로 정렬하여 출력한뒤 다음에는 모든 숫자를 더한 값을 이어서 출력한다.
    //ex) K1KA5CB7 이면 ABCKK13이다.
    //길이는 1 ~ 100000 이다.  O(N2) 넘기않기

    //아스키 코드표를 이용하여 String을 쪼개서 대문자 -> 65 ~ 90 사이면 새로운 char배열에
    //아니면 숫자임.
    public static void main(String[] args) throws IOException {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String st = bf.readLine();
        char[] ch = new char[st.length()]; //문자열을 담기위한 빈 배열
        int num = 0;//숫자를 더하기 위한 변수

        for(int i=0 ; i<st.length(); i++) {
            if(65<= (int)st.charAt(i) && (int)st.charAt(i) <=90) { //영어 대문자일때
                ch[i] = st.charAt(i);
                System.out.println("1");
            }
            else { //숫자 일때
                num += st.charAt(i) - '0';

            }
        }
        Arrays.sort(ch); //오름차순정리
        String result = String.valueOf(ch);
     //   System.out.println(result);
        System.out.println(result +Integer.toString(num));
    }
}
