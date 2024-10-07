import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int ReverseN = 0;
        int ReverseM =0;
        while(N!=0) {
            ReverseN = (ReverseN *10) + (N%10);
            N /= 10;
        }
        while(M!=0) {
            ReverseM = (ReverseM *10) + (M%10);
            M /= 10;
        }
        if(ReverseN>ReverseM) {
            System.out.println(ReverseN);
        }
        else {
            System.out.println(ReverseM);
        }
    }
}
