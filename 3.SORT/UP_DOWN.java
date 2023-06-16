import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class UP_DOWN {
    //수를 큰수부터 작은수로 나열하라.



    public static void main(String[] args) throws IOException {
        BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        Integer[] arr = new Integer[N];

        for( int i=0 ; i<arr.length; i++) {
            int j = Integer.parseInt(bf.readLine());
            arr[i] = j;
        }

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
