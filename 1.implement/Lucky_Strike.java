import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lucky_Strike {

    //문제
    //현재 캐릭터의 점수 N
    //자리수를 기준으로 N을 반으로 나누어 왼쪽부분의 자리수 합과 오른쪽 부분의 자리수 합을 더한 값이 동일한 상황
    //ex)) 123,402  면 1+2+3  4+2  는 같음.
    //N이 주어지면 럭키 스트레이트를 사용할 수 있는 상태인지 아닌지를 알려준다.
    //N은 10 ~ 99,999,999  O(N) ~ O(logN)
    //럭키 스트레이트면 LUCKY 없으면 READY
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String N = bf.readLine();
        int length = N.length();
        int front_num =0;
        int back_num=0; //오른쪽 자리수 합 체크 변수

        for(int i=0 ; i<length; i++) {  //charAt - '0'
            if(i<=(length/2)-1) {
                front_num += N.charAt(i) - '0'; //아스키 코드 응용
            }
            else{
                back_num += N.charAt(i) - '0';
            }
        }
        if(front_num == back_num) {
            System.out.println("LUCKY");
        }
        else {
            System.out.println("STRIKE");
        }

    }
}
