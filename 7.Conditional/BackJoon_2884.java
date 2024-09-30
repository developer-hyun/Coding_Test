import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon_2884 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if(M-45<0) {
            M = M+60-45;
            if(H==0) {
                H=24;
            }
            System.out.println(H-1 + " " +M);
        }
        else {
            M -= 45;
            System.out.println(H + " " + M);
        }
    }
}
