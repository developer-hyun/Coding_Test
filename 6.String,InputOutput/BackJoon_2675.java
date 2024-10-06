import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon_2675 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        for(int i=0;i<N;i++) {
            String[] str = bf.readLine().split(" "); //[3,ABC]이렇게 저장
            int num = Integer.parseInt(str[0]);
            String s = str[1];
            for(int j=0 ; j<s.length(); j++) {
                for(int k=0;k<num;k++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }

    }
}
