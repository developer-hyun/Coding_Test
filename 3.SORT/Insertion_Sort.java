import java.util.Arrays;

public class Insertion_Sort {

    public static int[] arr = {7,5,9,0,3,1,6,2,4,8};
    public static int min = 0;
    public static void main(String[] args) {

        for (int i = 1; i < arr.length; i++) {

            for (int j = i; j > 0; j--) {

                if (arr[j] < arr[j - 1]) {
                    min = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = min;
                } else {
                    break;
                }
            }
        }
        System.out.println(arr);
        
    }


































     //   for ( int i=1 ; i<arr.length; i++) {
        //       for ( int j=i ;j>0 ; j--) {
        //      System.out.println("1");
        //      if ( arr[j] < arr[j-1]) {
        //          min = arr[j];
        //          arr[j] = arr[j-1];
        //          arr[j-1] = min;
        //      }
        //      else {break;}
        //  }
        //}
        //System.out.println(Arrays.toString(arr));


    }

