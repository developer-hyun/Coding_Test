public class Fibo_Bottomup {
    public static int[] arr = new int[100];



    public static void main(String[] args) {
        arr[1]=1;
        arr[2]=1;

        for ( int i=3;i<99;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
    }

}
