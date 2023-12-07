import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Choose_Bollingball {

    //두 사람이 볼링을 치고자 한다. 볼링공은 총 N개  , N개만큼의 각 볼링공 무게가 주어진다. 같은 무게의 공이 있을 수 있지만 다른 공으로 간주한다.
    //이때 서로 다른 무게를 선택하는 경우의 수를 구하여라.

    //N은 1 ~ 1000 O(N3)
    //

    //1. 해당문제는 서로 다른 무게를 선택하는 경우의 수를 구하는데 같은 무게가 있을 수 있는 경우이다.
    //2. 순차적으로 첫번째 인덱스부터 출발하여 같은 무게가 아닐 경우에는 최종 경우에수 (result)에 추가한다.
    //3. 첫번째 인덱스 다음에는 두번째 인덱스 그 다음에는 세번째 인덱스로 간다.  이중 for문을 사용해야한다.
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        ArrayList<Integer> weight = new ArrayList<>();
        StringTokenizer st= new StringTokenizer(bf.readLine());

        for (int i=0 ; i<N; i++) {
            weight.add(Integer.parseInt(st.nextToken()));
        }

        int result =0;

        for ( int i=0; i<N-1 ; i++) {

            for ( int j=i+1; j<N; j++) {
                if(weight.get(i) != weight.get(j)) {
                    result +=1;
                }
            }
        }

        System.out.println(result);
    }
}
