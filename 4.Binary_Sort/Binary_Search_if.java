public class Binary_Search_if {
    public static void Binary_Search_if ( int arr[], int target, int start , int end) {
        while ( start<=end) {
            int mid = (start+ end) /2;
            if ( target == arr[mid]) {
                //return mid;
            }
            if ( target < arr[mid]) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
    }

    public static void main(String[] args) {

    }
}
