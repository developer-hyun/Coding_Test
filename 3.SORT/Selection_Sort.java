import java.util.Arrays;

public class Selection_Sort {

    public static int[] arr = {7,5,9,0,4,2,6,3,5,8};
    public static int min =0;

    public static void main(String[] args) {

        for ( int i=0 ; i<arr.length;i++){

            for (int j = i+1; j<arr.length;j++ ) {
                if ( arr[i]> arr[j]) {
                    min = arr[j];
                    arr[j] = arr[i];
                    arr[i] = min;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
