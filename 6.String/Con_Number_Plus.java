import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Con_Number_Plus {

    //연속된 자연수의 합 구하기
    //자연수가 N이 존재한다.  이때 N을 연속된 자연수의합이 몇개인지 구하여라. 예를들어 N이 15일때 15 , 7+8 , 4+5+6 , 1+2+3+4+5 이다.

    //1.배열에 N까지 자연수를 저장한다.  --> 불필요
    //2. 1부터 시작하여 N까지 순회하는데 두개의 변수포인터를 지정해준다.
    //3. 총합<N이면 숫자를 늘려야하기때문에 end_point를 증가시킨다.
    //4. 총합>N이면 숫자를 빼야하기때문에 start_point를 증가시킨다.
    //5. 총합 == N이면 연속된 자연수가 되었기때문에 count를 증가시킨다.

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int sum =1;
        int count =1;
        int start_point=1;
        int end_point=1;

        while(end_point!=N) {
            if(sum<N) {
                end_point+=1;
                sum += end_point;
            }
            else if(sum>N) {
                sum -= start_point;
                start_point +=1;
            }
            else {
                count +=1;
                end_point +=1;
                sum+= end_point;
            }
        }
        System.out.println(count);
    }
}
