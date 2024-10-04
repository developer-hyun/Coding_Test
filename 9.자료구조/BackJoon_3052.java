import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon_3052 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[42];
        for(int i=0 ; i<10; i++) {
            int N = (Integer.parseInt(bf.readLine())) % 42;
            arr[N] =1;
        }
        int count =0;
        for(int j=0 ; j<arr.length; j++) {
            if(arr[j] ==1) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
