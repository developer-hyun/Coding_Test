import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[31];
        for(int i=1 ; i<29 ; i++) {
            int N = Integer.parseInt(bf.readLine());
            arr[N] = 1;
        }
        for(int j=1 ; j<arr.length;j++) {
            if(arr[j] ==0) {
                System.out.println(j);
            }
        }
    }
}
