import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class BackJoon_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if (A == B && B == C) {
            System.out.println(10000 + (A * 1000));
        }
        else if ((A == B) || (A == C) || (B == C)) {
            if (A == B) {
                System.out.println(1000 + (A * 100));
            } else if (A == C) {
                System.out.println(1000 + (A * 100));
            } else {
                System.out.println(1000 + (B * 100));
            }
        }
        else {
            if (A > B) {
                int big_num = A;
                if (big_num > C) {
                    System.out.println(big_num * 100);
                } else {
                    System.out.println(C * 100);
                }
            } else {
                int big_num = B;
                if (big_num > C) {
                    System.out.println(big_num * 100);
                } else {
                    System.out.println(C * 100);
                }
            }
        }
    }
}
