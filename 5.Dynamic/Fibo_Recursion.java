public class Fibo_Recursion {

    public static int fibo(int x) {
        if (x ==1) {
            return 1;
        }
        if ( x==2) {
            return 1;
        }
        return fibo(x-1) + fibo(x-2);
    }

    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
}
