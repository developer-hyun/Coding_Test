import javax.naming.InterruptedNamingException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Change_String {


    //문자열 바꾸기
    //문자열 S는 100만보다 작다.   ->  O(N)
    // 0으로 뒤집는 변수와 1로 뒤집는 변수를 만든다.
    // 숫자가 연속되면 하나의 숫자로 치기때문에 다음자리 숫자까지 비교해야한다.
    //첫 숫자는 따로 처리한후 for문을 통해 앞에서부터 찾으면서 앞과 뒤의 숫자가 다를때 다음숫자가 0이냐 1이냐에 따라 count를 추가해준다.
    //똑같으면 앞에서 이미 처리를했음으로 볼필요가없고 숫자가 바뀔때만 count를 추가해야한다.



    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String st = bf.readLine();
        int count1 = 0;
        int count0 =0;

        if ( st.charAt(0) == '0') {
            count0 +=1;
        }
        else {
            count1 +=1;
        }


        for( int i=0 ; i<st.length()-1; i++) {
            if ( st.charAt(i) != st.charAt(i+1)) {
                if ( st.charAt(i+1) =='1') {
                    count1 +=1;
                }
                else {
                    count0 +=1;
                }
            }
        }
        System.out.println(Math.min(count0,count1));
    }
}
