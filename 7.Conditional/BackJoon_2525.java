import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int H =  Integer.parseInt(st.nextToken());
        int M =  Integer.parseInt(st.nextToken());
        int C =  Integer.parseInt(bf.readLine());

        if(M+C > 0) {
            int Plus_Hour = (M+C)/60;
            M = (M+C) - (Plus_Hour*60);
            if(H + Plus_Hour >23) {
                H = H+Plus_Hour-24;
                System.out.println(H + " "+ M);
            }
            else {
                System.out.println(H+Plus_Hour + " " + M);
            }
        }
        else {
            System.out.println(H + " "+M+C);
        }
    }
}
