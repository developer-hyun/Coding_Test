import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Sequential_Search {

//생성할 원소 개수 입력 후 문자열
    //원소 개수만큼 문자열 입력후 찾을 문자열이 어디있는지.
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        String word = st.nextToken();
        String[] arrWord = new String[N];
        int result =0;
        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        for ( int i=0 ; i<N;i++) {
            arrWord[i] = st1.nextToken();
            if ( word.equals(arrWord[i])) {
                result = i+1;
            }
        }
        System.out.println(result);
    }
}
