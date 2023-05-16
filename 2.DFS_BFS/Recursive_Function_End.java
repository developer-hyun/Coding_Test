public class Recursive_Function_End {

    public static void recursive(int i) {
        if (i==100) {
            return;
        }
        System.out.println(i + "번째 재귀함수");
        recursive(i+1);
    } //while
    public static void main(String[] args) {
        recursive(1);
    }
}
