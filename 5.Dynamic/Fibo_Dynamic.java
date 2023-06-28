public class Fibo_Dynamic {

    public static int[] arr = new int[100];
    public static int fibo_D(int x) {
        if (x ==1 || x==2){
            return 1;
        }
        if ( arr[x] !=0) {
            return arr[x];
        }
        arr[x] = fibo_D(x-1) + fibo_D(x-2);
        return arr[x];
    }

    public static void main(String[] args) {
        System.out.println(fibo_D(5));
    }
}
