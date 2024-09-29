import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon_9498 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        if(N>=90) {
            System.out.println("A");
        }
        else if(80<=N && N<=89) {
            System.out.println("B");
        }
        else if(70<=N && N<=79) {
            System.out.println("C");
        }
        else if(60<=N && N<=69) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }

    }
}
