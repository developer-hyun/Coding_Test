import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon_2753 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        if((N%4==0) && ((N%100!=0) || (N%400==0))) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}
