import java.util.Arrays;

public class Count_Sort {

    public static int[] arr = {7,5,9,0,3,1,6,2,9,1,4,8,0,5,2};
    public static int[] empt = new int[arr.length+1];
    public static void main(String[] args) {

        for ( int i=0 ; i<arr.length ; i++) {
            empt[arr[i]] +=1;
        }

        for ( int j=0; j<empt.length ; j++) {
            for ( int k=0 ; k < empt[j] ; k++) {
                System.out.println(j + " ");
            }
        }



    }
}
