public class Quick_Sort {

    public static int[] arr = {5,7,9,0,4,2,6,3,4,8};

    public void quick(int start,int end) {
        if ( start >= end) {   //왤까
            return;
        }
        int pivort = start;  //피벗(기준점은 )  시작원소
        int left = start+1; //왼쪽비교는 시작원소 +1
        int right = end;

        while (left <=right) { //왼쪽과 오른쪽에서 출발하여 만날때까지

            while ( left <=end && arr[left] <= arr[pivort]) { //기준점보다 작은원소는 가만히 냅둔다.
                left +=1;
            }
            while ( right > start && arr[right] >= arr[pivort]) {
                right -= 1;
            }
            if ( left > right) {
                int tmp = arr[pivort];
                arr[pivort] = arr[right];
                arr[right] = tmp;
            }
            else {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
        

    }
    public static void main(String[] args) {



    }
}
