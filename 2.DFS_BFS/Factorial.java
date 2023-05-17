public class Factorial {
    public static void fact1(int i) {
        int result = 1;
            for(int j=1;j<=i;j++) {
                result = result * j;
            }
        System.out.println(result);
    }

    public static int fact2(int i) {

        if (i <=1) return 1;
        return i * fact2(i-1);
    }

    public static void main(String[] args) {

    fact1(5);
        System.out.println(fact2(5));

    }
}
