import javax.imageio.IIOException;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Impossible_money {


    //N개의 동전을 이용하여 만들수 없는 양의 정수 금액 중 최솟값을 구하시오
    //N은 1~ 1000  -> O(N3)
    //쉽게말해 기존타켓은 이미 달성했음으로 논외로 치며  거기에 전 코인의값을 더했을 경우가 만들 수 있는 최대의 양의정수 값인데 해당 수가 현재코인의 값보다 작을 경우에는 다 더해도 현재 코인의 값 미만의 수를 만들 수 없다.
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N  = Integer.parseInt(bf.readLine());
        ArrayList<Integer> coin = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(bf.readLine());

        for ( int i=0 ; i<N; i++) {
            coin.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(coin);

        int target =1;
        for ( int i=0 ; i<coin.size(); i++) {
            if (target < coin.get(i)) {
                break;
            }
            else {
                target += coin.get(i);
            }
        }


    }
}
