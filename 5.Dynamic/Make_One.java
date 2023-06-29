import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Make_One {
    public static int[] arr = new int[3000];

    // 정수 X
    // X가 5로 나누어 떨어지면 5로 나눈다
    //가 3으로 나누어 떨어지면 3으로 나눈다
    //x가 2로 나누어떨어지면 2로나눈다
    //x에서 1을 뺀다.
    //x를 1로 만들려한다. 연산 최소 회수를 구하라.
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Integer X = Integer.parseInt(bf.readLine());

        for ( int i=2 ; i<X+1;i++){ //바텀 업 방식
            arr[i] = arr[i-1] +1; //1을 뺸다.
            if ( i % 2==0) {
                int a = arr[i/2] +1;
                if ( arr[i] > a) {
              //      System.out.println(a);
                    arr[i] = arr[i/2]+1;
                }
            }
            if ( i % 3 ==0) {
                if ( arr[i] > arr[i/3]+1) {
                    arr[i] = arr[i/3]+1;
                }
            }
            if ( i%5 ==0) {
                if  ( arr[i] > arr[i/5]+1) {
                    arr[i] = arr[i/5]+1;
                }
            }
        }
        System.out.println(arr[X]);
    }
}
