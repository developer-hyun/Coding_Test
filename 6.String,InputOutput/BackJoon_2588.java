import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf =  new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int M = Integer.parseInt(bf.readLine());
        System.out.println((M%10)*N);
        System.out.println((M%100)/10*N);
        System.out.println((M/100)*N);
        System.out.println(N*M);
    }
}
